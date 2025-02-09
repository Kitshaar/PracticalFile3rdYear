package org.Kitshaar;

import java.util.logging.Logger;

public class ThreadPriorities {
    /*
    13. Explain by program how thread priorities work in Java.
    What impact do they have on thread scheduling?
     */
    private static final Logger logger = Logger.getLogger(ThreadPriorities.class.getName());

    static class MyThread extends Thread {
        MyThread(String name, int priority) {
            setName(name);
            setPriority(priority);
        }
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " is running with priority " + getPriority());
            }
        }
    }

    public static void main(String[] args) {
        logger.info("Program Started");

        MyThread t1 = new MyThread("Low Priority Thread", Thread.MIN_PRIORITY);
        MyThread t2 = new MyThread("Medium Priority Thread", Thread.NORM_PRIORITY);
        MyThread t3 = new MyThread("High Priority Thread", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            logger.warning("Thread interrupted: " + e.getMessage());
        }

        logger.info("Program Ended");
    }
}
