package org.Kitshaar;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaReflection {
    /*
    27. Explain the concept of Java Reflection. How can it be useful?
     */

    static class Sample {
        private String message = "Hello Reflection!";
        private void display() {
            System.out.println("Private Method Invoked");
        }
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Sample.class;
        Sample obj = new Sample();

        // Accessing private field
        Field field = cls.getDeclaredField("message");
        field.setAccessible(true);
        System.out.println("Field Value: " + field.get(obj));

        // Invoking private method
        Method method = cls.getDeclaredMethod("display");
        method.setAccessible(true);
        method.invoke(obj);
    }
}
