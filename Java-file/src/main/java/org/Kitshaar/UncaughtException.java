package org.Kitshaar;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UncaughtException {
    /*
    3. Write a program to show what happens if an
       Exception is not caught in a try - catch block
       using logger?
     */

    private static final Logger logger = LoggerFactory.getLogger(UncaughtException.class);

    static void riskyMethod() {
        throw new RuntimeException("Unhandled Exception Example");
    }

    public static void main(String[] args) {
        logger.warn("Program Started");
        riskyMethod(); // No try-catch, will crash the program
        logger.warn("Program Ended"); // This line won't execute
    }
}
