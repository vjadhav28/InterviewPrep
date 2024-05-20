package org.example.Numbers;

import java.util.Arrays;
import java.util.List;
//Criteria is -> Sum of numbers, if odd, multiply by 2, if even keep same, if negative don’t consider.
public class SumofAllelemtsInList {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, 9, 10);
        System.out.println((Integer) ls.stream().map(x -> {
            if (x == 0 || x % 2 == 0) {
                return x;
            } else if (x % 2 == 1) {
                return x * 2;
            } else {
                return 0;
            }
        }).mapToInt(Integer::intValue).sum());
        int sum = ls.stream().reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
