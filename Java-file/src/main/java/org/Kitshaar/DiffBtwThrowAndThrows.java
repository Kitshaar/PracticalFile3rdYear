package org.Kitshaar;

public class DiffBtwThrowAndThrows {
    /*
    1. Write a program to show the difference btw throw and throws in Java?
     */

    // 'throws' declares that this method might throw an exception
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) throw new ArithmeticException("Not eligible"); // 'throw' is used to explicitly throw an exception
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
