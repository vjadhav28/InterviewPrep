package org.example.String;

import java.util.Scanner;

class String_Reverse {

    public static String FirstReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder b= sb.reverse();
        String rev = b.toString();
        return rev;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}
