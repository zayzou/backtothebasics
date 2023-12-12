package com.zayzou.extra.divers.interview;

import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {

        try {
            System.out.println("execute try");
            throw new Exception("This is an exception");
        } catch (Exception ex) {
            System.out.println("Execute exception " + ex.getMessage());
        } finally {
            System.out.println("Execute finally");
        }
        //try-with-ressources
        try (FileReader reader = new FileReader("")) {

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
