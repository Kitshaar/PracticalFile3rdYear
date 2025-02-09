package org.Kitshaar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class TryWithResources {
    /*
    7. Write a program to demonstrate try with resources in Java
     */
    private static final Logger logger = Logger.getLogger(TryWithResources.class.getName());

    static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            logger.info("File Content: " + br.readLine());
        } catch (IOException e) {
            logger.warning("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        logger.info("Program Started");
        readFile();
        logger.info("Program Ended");
    }
}
