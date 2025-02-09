package org.Kitshaar;

import java.util.logging.Logger;

public class FinallyBlock {
    /*
    4. Write a program to display the use of finally block?
     */
    private static final Logger logger = Logger.getLogger(FinallyBlock.class.getName());

    static void riskyMethod() {
        try {
            int result = 10 / 0; // This will cause an exception
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.warning("Exception caught: " + e.getMessage());
        } finally {
            logger.info("Finally block executed");
        }
    }

    public static void main(String[] args) {
        logger.info("Program Started");
        riskyMethod();
        logger.info("Program Ended");
    }
}
