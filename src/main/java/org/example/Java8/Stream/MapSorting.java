package org.example.Java8.Stream;

import java.util.HashMap;
import java.util.Map;

public class MapSorting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("yess",3);
        map.put("yes",1);
        map.put("yesss",9);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
