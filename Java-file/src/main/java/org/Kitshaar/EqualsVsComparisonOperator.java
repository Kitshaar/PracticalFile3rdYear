package org.Kitshaar;

public class EqualsVsComparisonOperator {
    /*
    24. What is the difference between == and .equals method in Java?
    When do you use one over the other?
     */
    public static void main(String[] args) {
        // Using == (Reference Comparison)
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("Using == : " + (str1 == str2)); // false (different objects)

        // Using .equals() (Content Comparison)
        System.out.println("Using .equals() : " + str1.equals(str2)); // true (same content)

    }
}
