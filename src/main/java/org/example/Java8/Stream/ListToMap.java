package org.example.Java8.Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> hostingProviders = Arrays.asList("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow");
        System.out.println("list: " + hostingProviders);

        Map<String, Integer> cards2Length = hostingProviders.stream() .
                collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("map: " + cards2Length);

        Map<String, Integer> cards2Length1 = hostingProviders.stream() .
                collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(cards2Length1);

    }
}
