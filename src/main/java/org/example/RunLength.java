package org.example;

import java.util.Scanner;

public class RunLength {

    public static String RunLength(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(str.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(str.charAt(str.length() - 1));
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(RunLength(s.nextLine()));  // Output: 2a2b1c1d1e
        System.out.println(RunLength("wwwbbbw"));  // Output: 3w3b1w
    }
}