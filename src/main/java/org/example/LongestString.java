package org.example;

import java.util.*;

public class LongestString {

    public static void main(String[] args) {
        String [] arrayInput = {"vivek"  , "kadiyan" , "ram" , "chaudhary vivek kadiyan"};

        String longest = Arrays.stream(arrayInput).reduce((word1,word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println("String longest : " + longest);

        //Write a Java program to find all elements from array which starts from 2 using stream API.

        int inputArray[] = {1,25,34,45,26,26,37};

        List<Integer> out = Arrays
                .stream(inputArray)
                .boxed()
                .map(x->x.toString())
                .filter(x->x.startsWith("2"))
                .map(Integer::parseInt)
                .toList();

        System.out.println(out);

        //Write a program to find first repeat element/character from a given string by Java Streams.

        String input = "lovevivek";

        List<String> in = List.of(input.split(""));

        in.stream()
                .filter(x-> Collections.frequency(in,x)==2).limit(1).forEach(System.out::println);

        // Write a program to find second highest element from an array , Array can contain duplicate elements . Solve it by stream java 8.

        int array[] = {1,3,2,4,5,6,6,9,9,10,11};

        Arrays.stream(array)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);



        //Write a program to find first non repeat element from a given string by Java Streams.

        String input1="iloveprogrammsng";

        Arrays.stream(input1.split(""))
                .distinct()
                .limit(1)
                .forEach(System.out::println);

        //Write a program to find unique elements in given string by JAVA streams.
        String input2="vivekkadiyan";
        List<String> str = Arrays.asList(input2.split(""));
        List<String> uni = str.stream()
                .filter(x->Collections.frequency(str,x)==1)
                .toList();
        System.out.println(uni);
    }
}
