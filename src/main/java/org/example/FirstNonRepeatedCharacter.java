package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "India is my country";
        Character result = findFirstNonRepeatedCharacter(str);

        if (result != null) {
            System.out.println("First non-repeated character is: '" + result + "'");
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static Character findFirstNonRepeatedCharacter(String str) {
        return str.chars()
                .mapToObj(c -> (char) c) // Convert int to char
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}