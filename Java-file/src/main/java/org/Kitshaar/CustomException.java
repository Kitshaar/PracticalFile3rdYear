package org.Kitshaar;

public class CustomException {
    /*
    2. Write a program with a custom exception in Java?
     */
    // Custom exception class
    static class MyException extends Exception {
        MyException(String message) {
            super(message);
        }
    }

    // Method that throws custom exception
    static void validate(int num) throws MyException {
        if (num < 0) throw new MyException("Number cannot be negative");
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        try {
            validate(-5); // This will throw MyException
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
