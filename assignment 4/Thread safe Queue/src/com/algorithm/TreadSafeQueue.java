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


    // add()
    public boolean add(E e) {
        if (offer(e)) {
            return true;
        }
        else {
            throw new IllegalStateException("Queue full");
        }
    }

    public boolean offer(E e) {
        if (e == null) throw new NullPointerException();
        final AtomicInteger count = this.count;
        if (count.get() == capacity)
            return false;
        int c = -1;
        Node<E> node = new Node<E>(e);
        final ReentrantLock putLock = this.putLock;
        putLock.lock();
        try {
            if (count.get() < capacity) {
                enqueue(node);
                c = count.getAndIncrement();
                if (c + 1 < capacity)
                    notFull.signal();
            }
        } finally {
            putLock.unlock();
        }
        if (c == 0)
            signalNotEmpty();
        return c >= 0;
    }

    private void enqueue(Node<E> node){
        last = last.next = node;
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

    private void signalNotEmpty(){
        final ReentrantLock takeLock = this.takeLock;
        takeLock.lock();
        try {
            notEmpty.signal();
        }finally {
            takeLock.unlock();
        }
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


    // remove()
    public boolean remove(Object o){
        if(o == null) return false;
        fullyLock();

        try {
            for(Node<E> trail = head, p = trail.next;
                p != null;
                trail = p, p = p.next){
                if(o.equals(p.item)){
                    unlink(p, trail);
                    return true;
                }
            }
            return false;
        }finally {
            fullyUnlock();
        }
    }

    void unlink(Node<E> p, Node<E> trail){
        p.item = null;
        trail.next = p.next;
        if(last == p){
            last = trail;
        }
        if(count.getAndDecrement() == capacity){
            notFull.signal();
        }
    }

    void fullyLock() {
        putLock.lock();
        takeLock.lock();
    }

    void fullyUnlock() {
        takeLock.unlock();
        putLock.unlock();
    }


    // peek()
    public E peek() {
        if (count.get() == 0)
            return null;
        final ReentrantLock takeLock = this.takeLock;
        takeLock.lock();
        try {
            // 取第一个元素
            Node<E> first = head.next;
            if (first == null)
                return null;
            else
                return first.item;
        } finally {
            takeLock.unlock();
        }
    }

    public int size() {
        return count.get();
    }


    // isEmpty()
    public boolean isEmpty() {
        if(this.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
