package org.example.Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // find the sum of all elements in a list using Java Stream API
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);

        //product of all elements in a list of integers using Java Stream API.
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of all elements: " + product);


        //find and print the second largest number using Java Stream API.
        Optional<Integer> secondLargest = numbers.stream()
                .sorted((num1, num2) -> num2 - num1)
                .skip(1)
                .findFirst();
        System.out.println("Second largest number: " + (secondLargest.isPresent() ? secondLargest.get() : "N/A"));

        //
        Optional<Integer> secondLargest1 = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst();
        System.out.println("Second largest number: " + (secondLargest.isPresent() ? secondLargest.get() : "N/A"));


        //program to find and print the maximum element using Java Stream API
        List<Integer> number = Arrays.asList(2, 4, 8, 6, 10);
        int max = number.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
        System.out.println("Max element: " + max);
        //calculate the average of all the numbers using Java Stream API.
        OptionalDouble average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));

        //count the number of strings containing a specific character ‘a’ using Java Stream API.
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        char searchChar = 'a';
        long count = strings.stream()
                .filter(str -> str.contains("a"))
                .count();
        System.out.println("Number of strings containing a - "+ count);

        //write a program to find and print the strings with length greater
        // than a specified value 5 using Java Stream API.
        int minLength = 5;
        List<String> longStrings = strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
        System.out.println("Strings with length greater than " + minLength + ": " + longStrings);


        //check if a list of strings contains a specific string using Java Stream API.
        String target = "banana";
        boolean containsString = strings.stream()
                .anyMatch(s -> s.equals(target));
        System.out.println("List contains string '" + target + "': " + containsString);


        //write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
        String prefix = "a";
        List<String> stringsWithPrefix = strings.stream()
                .filter(s -> s.startsWith(prefix))
                .collect(Collectors.toList());
        System.out.println("Strings starting with prefix '" + prefix + "': " + stringsWithPrefix);


        //write a program to find and print the shortest string using Java Stream API.
        String shortestString = strings.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Shortest string: " + shortestString);

        String shortestString1 = strings.stream()
                .min((str1, str2) -> str1.length() - str2.length())
                .orElse(null);
        System.out.println("Shortest string: " + shortestString1);

        //sort a list of strings in alphabetical order using Java Stream API.
        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted strings: " + sortedStrings);

        //write a program to concatenate all the strings using Java Stream API.
        String concatenatedString = strings.stream()
                .collect(Collectors.joining(","));
        System.out.println("Concatenated string: " + concatenatedString);

        // find the longest string in a list of strings using Java Stream API.
        Optional<String> longestString = strings.stream()
                .max((str1, str2) -> str1.length() - str2.length());
        System.out.println("Longest string: " + (longestString.isPresent() ? longestString.get() : "N/A"));
        Optional<String> longestString1 = strings.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("Longest string other approach: " + (longestString1.orElse("N/A")));

        // convert a list of strings to uppercase using Java Stream API.
        List<String> string = Arrays.asList("apple", "banana", "orange", "grape");
        List<String> upperCaseStrings = string.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase strings: " + upperCaseStrings);


        // write a program to find and print the prime numbers using Java Stream API.
        List<Integer> primes = numbers.stream()
                .filter(Streams::isPrime)
                .collect(Collectors.toList());
        System.out.println("Prime numbers: " + primes);

        //reverse strings
        Collections.reverse(strings);
        System.out.println("Reversed list: " + strings);

        //write a program to find and print the strings containing only vowels using Java Stream API.
        List<String> vowelStrings = strings.stream()
                .filter(s -> s.matches("[aeiouAEIOU]+"))
                .collect(Collectors.toList());
        System.out.println("Strings containing only vowels: " + vowelStrings);

        //find the intersection of two lists of strings using Java Stream API.
        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");
        List<String> intersection = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println("Intersection of lists: " + intersection);

        //program to find the union of two lists of integers using Java Stream API.
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list4 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> union = Stream.concat(list3.stream(), list4.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Union of lists: " + union);

        //write a program to find and print the strings containing duplicate characters using Java Stream API.
        List<String> duplicateStrings = strings.stream()
                .filter(s -> s.length() != s.chars().distinct().count())
                .collect(Collectors.toList());
        System.out.println("Strings containing duplicate characters: " + duplicateStrings);

        //check if all elements in a list of strings are of the same length using Java Stream API.
        boolean sameLength = strings.stream()
                .map(String::length)
                .distinct()
                .count() == 1;
        System.out.println("All elements have the same length: " + sameLength);

        //write a program to find and print the difference between the maximum and
        // minimum numbers using Java Stream API.
        OptionalInt maximum = numbers.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = numbers.stream().mapToInt(Integer::intValue).min();
        int difference = maximum.getAsInt() - min.getAsInt();
        System.out.println("Difference between maximum and minimum numbers: " + difference);

        //remove all whitespace from a list of strings using Java Stream API.
        List<String> stringss = Arrays.asList("apple", "ba nana", "kiwi", "oran ge", "pear");
        List<String> noWhitespace = strings.stream()
                .map(s -> s.replaceAll("\\s", ""))
                .collect(Collectors.toList());
        System.out.println("List with whitespace removed: " + noWhitespace);

        //write a program to find and print the strings with the minimum length using Java Stream API.
        Optional<String> minLengthString = strings.stream().min(Comparator.comparingInt(String::length));
        System.out.println("String with minimum length: " + minLengthString.orElse("No strings in the list"));

        // find the frequency of each element in a list of integers using Java Stream API.
        Map<Integer, Long> frequencyMap = numbers.stream()
                                    .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println("Frequency of each element: " + frequencyMap);

        //check if a list of integers is sorted in ascending order using Java Stream API
        boolean sortedAscending = numbers.stream().sorted().collect(Collectors.toList()).equals(numbers);
        System.out.println("Is the list sorted in ascending order? " + sortedAscending);

        int k = 3; // Find the 3rd smallest element
        Optional<Integer> kthSmallest = numbers.stream().sorted().skip(k - 1).findFirst();
        System.out.println("The " + k + "th smallest element: " + (kthSmallest.isPresent() ? kthSmallest.get() : "N/A"));


    }

    // write a program to find and print the prime numbers using Java Stream API.

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
