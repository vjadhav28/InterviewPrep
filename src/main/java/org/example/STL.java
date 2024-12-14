package org.example;

import java.util.*;

public class STL {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4,5,7,9,8);

        List<String> arr1 = Arrays.asList("AXA", "ABBCCAA" , "ATA",  "NOON");

        List<String> palindrome = arr1.stream()
                .filter(x -> {
                    String rev = String.valueOf(new StringBuilder(x).reverse());
                    return x.equals(rev);
                })
                .toList();

        System.out.println("Palindrom list is "+ palindrome);

        Optional<Integer> secondHighest =
                num.stream()
                        .sorted(Comparator.reverseOrder())
                        .skip(1).limit(1).findFirst();
        System.out.println("Second highest number is : "+ secondHighest.toString());

        List<Integer> res = num.stream()
                .map(x-> x*2)
                .toList();

        System.out.print(res);
    }
}
