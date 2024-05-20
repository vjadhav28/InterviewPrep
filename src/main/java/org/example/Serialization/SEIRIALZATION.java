package org.example.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SEIRIALZATION implements Serializable {

    int id = 0;
    String name = "Varsha";

    public SEIRIALZATION(int id, String name) {
        name = "nomenclature";
        id = 10;
    }

    public static void main(String[] args) throws IOException {
        String filename = "filename here";
        SEIRIALZATION person = new SEIRIALZATION(1, "John");

        //serialazition

        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filename))) {
            obj.writeObject(person);
            System.out.println("Success");
        } catch (Exception e) {

            System.out.println("Unsuccessful");
        }


    }
}
