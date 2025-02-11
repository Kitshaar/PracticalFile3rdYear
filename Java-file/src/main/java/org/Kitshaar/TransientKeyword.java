package org.Kitshaar;

import java.io.*;

public class TransientKeyword {
    /*
    28. What is the significance of the transient keyword in Java?
     */

    static class User implements Serializable {
        private static final long serialVersionUID = 1L;
        String name;
        transient String password; // Will not be serialized

        User(String name, String password) {
            this.name = name;
            this.password = password;
        }
    }

    public static void main(String[] args) throws Exception {
        User user = new User("John", "secret123");

        // Serialize object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();

        // Deserialize object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User deserializedUser = (User) ois.readObject();
        ois.close();

        // Password field is not serialized, so it will be null
        System.out.println("Name: " + deserializedUser.name);
        System.out.println("Password: " + deserializedUser.password);
    }
}
