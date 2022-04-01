package com.algorithm;

public class Main {

    public static void main(String[] args) {

        TreadSafeQueue<Integer> linkedBlockingQueue = new TreadSafeQueue<>();

        System.out.println(linkedBlockingQueue.isEmpty());
        linkedBlockingQueue.add(10);
        linkedBlockingQueue.add(20);
        linkedBlockingQueue.add(30);
        System.out.println(linkedBlockingQueue.isEmpty());

        System.out.println(linkedBlockingQueue.peek());
        linkedBlockingQueue.remove(10);
        System.out.println(linkedBlockingQueue.peek());
        System.out.println(linkedBlockingQueue.isEmpty());
        linkedBlockingQueue.remove(20);
        linkedBlockingQueue.remove(30);
        System.out.println(linkedBlockingQueue.isEmpty());

    }
}
