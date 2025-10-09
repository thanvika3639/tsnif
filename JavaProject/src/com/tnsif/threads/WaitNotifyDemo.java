package com.tnsif.threads;

public class WaitNotifyDemo {

	public static void main(String[] args) {
		final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized(lock) {
                try {
                    System.out.println("Thread-1 waiting...");
                    lock.wait();
                    System.out.println("Thread-1 resumed!");
                } catch (InterruptedException e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(lock) {
                System.out.println("Thread-2 notifying...");
                lock.notify(); // change to lock.notifyAll() to wake all
            }
        });

        t1.start();
        try { Thread.sleep(500); } catch (Exception e) {}
        t2.start();

	}

}