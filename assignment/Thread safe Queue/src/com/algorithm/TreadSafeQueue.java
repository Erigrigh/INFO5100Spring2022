package com.algorithm;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TreadSafeQueue <E>{

    static class Node<E> {
        E item;
        Node<E> next;
        Node(E x) { item = x; }
    }

    private final int capacity;
    private final AtomicInteger count = new AtomicInteger();

    transient Node<E> head;
    private transient Node<E> last;

    private final ReentrantLock takeLock = new ReentrantLock();
    private final Condition notEmpty = takeLock.newCondition();
    private final ReentrantLock putLock = new ReentrantLock();
    private final Condition notFull = putLock.newCondition();

    // constructor
    public TreadSafeQueue() {
        this(Integer.MAX_VALUE);
    }
    public TreadSafeQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException();
        this.capacity = capacity;
        last = head = new Node<E>(null);
    }
    public TreadSafeQueue(Collection<? extends E> c) {
        this(Integer.MAX_VALUE);
        final ReentrantLock putLock = this.putLock;
        putLock.lock();
        try {
            int n = 0;
            for (E e : c) {
                if (e == null)
                    throw new NullPointerException();
                if (n == capacity)
                    throw new IllegalStateException("Queue full");
                enqueue(new Node<E>(e));
                ++n;
            }
            count.set(n);
        } finally {
            putLock.unlock();
        }
    }

    // 1.  void add(T data)
    public void add(E e) throws InterruptedException {
        if (e == null) throw new NullPointerException();

        int c = -1;
        Node<E> node = new Node(e);

        final ReentrantLock putLock = this.putLock;
        final AtomicInteger count = this.count;
        putLock.lockInterruptibly();

        try {

            while (count.get() == capacity) {
                notFull.await();
            }
            enqueue(node);
            c = count.getAndIncrement();
            if (c + 1 < capacity)
                notFull.signal();
        } finally {
            putLock.unlock();
        }
        if (c == 0)
            signalNotEmpty();
    }
    private void signalNotEmpty(){
        final ReentrantLock takeLock = this.takeLock;
        takeLock.lock();

        try {
            notEmpty.signal();
        }finally {
            takeLock.unlock();
        }
    }
    private void enqueue(Node<E> node){
        last = last.next = node;
    }

    // 2. T remove()
    public E remove() throws InterruptedException {
        E x;
        int c = -1;
        final AtomicInteger count = this.count;
        final ReentrantLock takeLock = this.takeLock;
        takeLock.lockInterruptibly();

        try {

            while (count.get() == 0) {
                notEmpty.await();
            }

            x = dequeue();
            c = count.getAndDecrement();

            if (c > 1)
                notEmpty.signal();
        } finally {
            takeLock.unlock();
        }
        if (c == capacity)
            signalNotFull();
        return x;
    }
    private void signalNotFull() {
        final ReentrantLock putLock = this.putLock;
        putLock.lock();

        try {
            notFull.signal();
        } finally {
            putLock.unlock();
        }
    }
    private E dequeue() {
        Node<E> h = head;
        Node<E> first = h.next;

        h.next = h;
        head = first;
        E x = first.item;
        first.item = null;
        return x;
    }

    // 3. T peek()
    public E peek() {
        if (count.get() == 0)
            return null;

        final ReentrantLock takeLock = this.takeLock;
        takeLock.lock();

        try {

            Node<E> first = head.next;
            if (first == null)
                return null;
            else
                return first.item;
        } finally {
            takeLock.unlock();
        }
    }


    // 4. boolean isEmpty()
    public boolean isEmpty() {
        if(count.get() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size() {
        return count.get();
    }

}
