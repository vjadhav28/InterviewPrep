package org.example.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPalindrome {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("abc","aba", "aaa", "abba", "bcbd");

        Consumer<String> reverse = x-> {StringBuilder revrs = new StringBuilder(x).reverse();
            if (x.equals(revrs.toString())) {
                System.out.println("this is pali");
            } else System.out.println("NOT");};

        words.forEach(reverse);

    }
}
