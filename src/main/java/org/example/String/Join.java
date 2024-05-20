package org.example.String;

import java.util.Arrays;
import java.util.List;

public class Join {
    public static void main(String[] args) {
        List<String> payCompanies = Arrays.asList("Apple pay", "Samsung Pay", "Paypal");
        String wallats = String.join(",", payCompanies);
        System.out.println("electronic wallats : " + wallats);

    }
}
