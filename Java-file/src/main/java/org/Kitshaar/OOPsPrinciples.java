package org.Kitshaar;

public class OOPsPrinciples {
    /*
    20. What are the four fundamental principles of OPPs? Explain via an Example.
     */

    // Encapsulation
     static class Car {
        private String model;
        public Car(String model) { this.model = model; }
        public String getModel() { return model; }
    }

    // Inheritance
    static class ElectricCar extends Car {
        private int batteryCapacity;
        public ElectricCar(String model, int batteryCapacity) {
            super(model);
            this.batteryCapacity = batteryCapacity;
        }
        public int getBatteryCapacity() { return batteryCapacity; }
    }

    // Polymorphism (Method Overloading)
   static class MathOperations {
        static int add(int a, int b) { return a + b; }
        static double add(double a, double b) { return a + b; }
    }

    // Abstraction
    abstract static class Animal {
        abstract void makeSound();
    }
    static class Dog extends Animal {
        public void makeSound() { System.out.println("Woof!"); }
    }

    public static void main(String[] args) {
        // Encapsulation
        Car car = new Car("Tesla");
        System.out.println("Car Model: " + car.getModel());

        // Inheritance
        ElectricCar eCar = new ElectricCar("Tesla Model S", 100);
        System.out.println("Electric Car Battery: " + eCar.getBatteryCapacity() + " kWh");

        // Polymorphism
        System.out.println("Addition Int: " + MathOperations.add(5, 10));
        System.out.println("Addition Double: " + MathOperations.add(5.5, 2.3));

        // Abstraction
        Animal dog = new Dog();
        dog.makeSound();
    }

}
