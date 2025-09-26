package com.tnsif.threads;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();
    }
}
