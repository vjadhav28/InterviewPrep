package org.example.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    int id = 0;
    String name = "Varsha";

    public Deserialization() {
    }

    public Deserialization(int i, String harpret) {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "filename here";
        Deserialization obj = new Deserialization(1,"Harpret");

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Deserialization personObj = (Deserialization) in.readObject();
            System.out.println("Person Id is " + personObj.id + "while name is " + personObj.name);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}