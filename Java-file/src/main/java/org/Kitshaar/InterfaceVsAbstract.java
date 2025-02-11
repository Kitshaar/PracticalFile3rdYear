package org.Kitshaar;

public class InterfaceVsAbstract {
    /*
    21. What is the difference between an abstract class and
    an interface in Java?
     */

    // Abstract Class Example
     abstract static class Animal {
        String name;
        Animal(String name) { this.name = name; }
        abstract void makeSound();
        void showName() { System.out.println("Animal: " + name); }
    }

    static class Dog extends Animal {
        Dog() { super("Dog"); }
        void makeSound() { System.out.println("Woof!"); }
    }

    // Interface Example
    interface Vehicle {
        void drive();
    }

    static class Car implements Vehicle {
        public void drive() { System.out.println("Car is driving"); }
    }

    public static void main(String[] args) {

        // Abstract Class Usage
        Animal dog = new Dog();
        dog.showName();
        dog.makeSound();

        // Interface Usage
        Vehicle car = new Car();
        car.drive();
    }
}
