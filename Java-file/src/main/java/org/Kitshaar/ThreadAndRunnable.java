package org.Kitshaar;

import java.util.logging.Logger;

public class ThreadAndRunnable {
    /*
    8. Write a program to show difference between thread class
    and runnable interface and use comments to explain when to use which one?
     */

    // Using Thread class (not recommended for reuse)
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread Class: Running Thread");
        }
    }

    // Using Runnable interface (preferred for flexibility and reuse)
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Runnable Interface: Running Thread");
        }
    }

    private static final Logger logger = Logger.getLogger(ThreadAndRunnable.class.getName());

    public static void main(String[] args) {
        logger.info("Program Started");

        // Using Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Using Runnable interface (preferred way)
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        logger.info("Program Ended");
    }
}
