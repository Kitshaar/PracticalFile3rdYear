package org.Kitshaar;

import java.util.logging.Logger;

public class UncheckedExceptions {
    /*
    5. Write a program to show difference between checked
       and unchecked exceptions in Java.
     */
    private static final Logger logger = Logger.getLogger(UncheckedExceptions.class.getName());

    // Checked Exception (Requires handling with throws or try-catch)
    static void checkedException() throws Exception {
        throw new Exception("This is a Checked Exception");
    }

    // Unchecked Exception (RuntimeException, doesn't require handling)
    static void uncheckedException() {
        throw new RuntimeException("This is an Unchecked Exception");
    }

    public static void main(String[] args) {
        try {
            checkedException();
        } catch (Exception e) {
            logger.warning("Caught Checked Exception: " + e.getMessage());
        }

        uncheckedException(); // No try-catch, will terminate program
    }

}
