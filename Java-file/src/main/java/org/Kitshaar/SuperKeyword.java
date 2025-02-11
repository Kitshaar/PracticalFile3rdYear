package org.Kitshaar;

public class SuperKeyword {
    /*
    26. What is the purpose of the super keyword in Java? Provide example of its use.
     */
    static class Parent {
        String name = "Parent Class";

        Parent() {
            System.out.println("Parent Constructor Called");
        }

        void display() {
            System.out.println("Method in Parent Class");
        }
    }

    static class Child extends Parent {
        String name = "Child Class";

        Child() {
            super(); // Calls Parent class constructor
            System.out.println("Child Constructor Called");
        }

        void show() {
            System.out.println("Child Name: " + name);
            System.out.println("Parent Name: " + super.name); // Accessing parent field
            super.display(); // Calling parent method
        }
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }

}
