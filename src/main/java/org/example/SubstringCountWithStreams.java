package org.example;

import java.util.stream.IntStream;

public class SubstringCountWithStreams {
    public static void main(String[] args) {
        String string = "AABCDAAABCVCAA";
        String substring = "AA";
        int count = countSubstringOccurrences(string, substring);
        System.out.println(count);
        int count1 = countSubstringOccurrenceswithoutstream(string, substring);
        System.out.println(count1);
    }

    public static int countSubstringOccurrences(String str, String sub) {
        // Create a stream of indices from 0 to (str.leng   th() - sub.length())
        return (int) IntStream.range(0, str.length() - sub.length() + 1)
                // Filter indices where the substring starting at the index matches 'sub'
                .filter(i -> str.substring(i, i + sub.length()).equals(sub))
                // Count the number of matching substrings
                .count();
    }

    public static int countSubstringOccurrenceswithoutstream(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length() - 1; // Move to the next character after the first character of the current match
        }

        return count;
    }
}