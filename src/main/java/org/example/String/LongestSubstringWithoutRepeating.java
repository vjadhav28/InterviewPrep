package org.example.String;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String input = "abcdedfga";
        System.out.println("The length of the longest substring without repeating characters is: " + longestSubstringWithoutRepeating(input));
    }

    public static String longestSubstringWithoutRepeating(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int[] maxLength = {0};
        int[] left = {0};
        AtomicReference<String> longestSubstring = new AtomicReference<>("");

        IntStream.range(0, s.length()).forEach(right -> {
            char c = s.charAt(right);
            if (charIndexMap.containsKey(c)) {
                left[0] = Math.max(charIndexMap.get(c) + 1, left[0]);
            }
            charIndexMap.put(c, right);
            if (right - left[0] + 1 > maxLength[0]) {
                maxLength[0] = right - left[0] + 1;
                longestSubstring.set(s.substring(left[0], right + 1));
            }
        });

        return longestSubstring.get();
    }
}
