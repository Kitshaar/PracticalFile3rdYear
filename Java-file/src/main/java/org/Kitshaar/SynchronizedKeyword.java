package org.Kitshaar;

import java.util.logging.Logger;

public class SynchronizedKeyword {
    /*
    9. Write a program to show the purpose of synchronized keyword in Java?
     */

    static class SharedResource {
        private int count = 0;

        // Synchronized method to ensure thread safety
        public synchronized void increment() {
            count++;
            System.out.print(Thread.currentThread().getName() + " - Count: " + count + "  ");
            if (count % 5 == 0)
                System.out.println();
        }
    }

    static class DemoThread extends Thread {
        private final SharedResource resource;

        DemoThread(SharedResource resource) {
            this.resource = resource;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                resource.increment();
            }
        }
    }
    private static final Logger logger = Logger.getLogger(SynchronizedKeyword.class.getName());

    public static void main(String[] args) {
        logger.info("Program Started");
        SharedResource resource = new SharedResource();

        Thread t1 = new DemoThread(resource);
        Thread t2 = new DemoThread(resource);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            logger.warning("Thread interrupted: " + e.getMessage());
        }

        logger.info("Program Ended");
    }
}
