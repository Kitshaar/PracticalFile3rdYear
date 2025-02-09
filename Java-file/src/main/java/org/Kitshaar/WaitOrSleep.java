package org.Kitshaar;

import java.util.logging.Logger;

public class WaitOrSleep {
    /*
    11. Write a program to show difference between wait()
    and sleep() in Java?
     */

    static class SharedResource {
        synchronized void waitMethod() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting");
                wait(); // Releases lock and waits
                System.out.println(Thread.currentThread().getName() + " resumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized void notifyMethod() {
            System.out.println("Notifying waiting thread");
            notify(); // Wakes up waiting thread
        }
    }
    private static final Logger logger = Logger.getLogger(WaitOrSleep.class.getName());

    public static void main(String[] args) {
        logger.info("Program Started");
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::waitMethod);
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Sleep does not release lock
                resource.notifyMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
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
