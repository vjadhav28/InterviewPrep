package org.example.Terminologies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Interview {
    public static void main(String[] args) {
        String[] inputstring = {"java","python","microservices","springboot","awsmicroservicescloud","spark"};

        List<String> res = Arrays.asList(inputstring);

        res.stream()
                .filter(s->s.startsWith("s"))
                .forEach(s->System.out.println(s));

        //lasrgest element
        Optional<String> longestString =
                res.stream()
                .reduce(BinaryOperator.maxBy(Comparator.comparing(String::length)))
                        .stream().findFirst();
//                                .max(Comparator.comparing(String::length))
//                .stream().findFirst();

        System.out.println("Longest string is "+longestString);

    }
}
