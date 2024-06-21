package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenecofLetter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","b","a","c","a");

        Map<String,Long> res = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String[] arr= {"a","v","a","v","a","v"};
        List<String> str = Arrays.asList(arr);
        Map<String, Long> cnt = str.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(cnt);


        System.out.println(res);
    }
}
