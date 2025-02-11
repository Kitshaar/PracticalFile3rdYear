package org.Kitshaar;

public class MultipleInheritance {
    /*
    25. How does Java handle multiple inheritance,
    considering it does not allow multiple inheritance with classes?
     */
    interface A {
        void show();
    }

    interface B {
        void display();
    }

    // Implementing multiple interfaces
    private static class C implements A, B {
        public void show() { System.out.println("Show method from Interface A"); }
        public void display() { System.out.println("Display method from Interface B"); }
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
