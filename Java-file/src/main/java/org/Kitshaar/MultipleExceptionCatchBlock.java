package org.Kitshaar;

import java.util.logging.Logger;

public class MultipleExceptionCatchBlock {
    /*
    6. Write a program to show a single catch handling
       multiple exception in Java?
     */
    private static final Logger logger = Logger.getLogger(MultipleExceptionCatchBlock.class.getName());

    static void multipleExceptions(int choice) {
        try {
            if (choice == 1) {
                int result = 10 / 0; // ArithmeticException
            } else if (choice == 2) {
                String str = null;
                str.length(); // NullPointerException
            }
        } catch (ArithmeticException | NullPointerException e) {
            logger.warning("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        logger.info("Program Started");
        multipleExceptions(1);
        multipleExceptions(2);
        logger.info("Program Ended");
    }
}
