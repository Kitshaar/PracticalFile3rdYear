package org.Kitshaar;

import java.util.logging.Logger;

public class Deadlock {
    /*
    12. Write a program to display deadlock in Java?
     */

    static class Resource {
        private final String name;
        Resource(String name) { this.name = name; }
        String getName() { return name; }
    }
    private static final Logger logger = Logger.getLogger(Deadlock.class.getName());

    public static void main(String[] args) {
        logger.info("Program Started");

        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                logger.info("Thread 1 locked " + resource1.getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource2) {
                    logger.info("Thread 1 locked " + resource2.getName());
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                logger.info("Thread 2 locked " + resource2.getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource1) {
                    logger.info("Thread 2 locked " + resource1.getName());
                }
            }
        });

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
