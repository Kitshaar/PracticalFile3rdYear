package org.Kitshaar;

import java.util.concurrent.*;
import java.util.logging.Logger;

public class ExecutorServiceOrThreadPoolExecutor {
    /*
    14. Program to the difference between Executor Service
    and Thread Pool Executor in Java?
     */
    private static final Logger logger = Logger.getLogger(ExecutorServiceOrThreadPoolExecutor.class.getName());

    static class Task implements Runnable {
        private final int id;
        Task(int id) { this.id = id; }
        public void run() {
            System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        logger.info("Program Started");

        // Using ExecutorService (default thread pool management)
       ExecutorService executorService = Executors.newFixedThreadPool(2);
            for (int i = 1; i <= 3; i++) {
                executorService.execute(new Task(i));
            }
            executorService.shutdown();

        // Using ThreadPoolExecutor (custom thread pool management)
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, 4, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        for (int i = 4; i <= 6; i++) {
            threadPoolExecutor.execute(new Task(i));
        }
        threadPoolExecutor.shutdown();

        logger.info("Program Ended");
    }
}
