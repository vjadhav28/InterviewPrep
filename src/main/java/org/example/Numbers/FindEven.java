package org.example.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEven {
    //find even numbers from a list of integers and multiply with 2 using stream java 8

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> ans = list.stream().filter(x-> (x%2==0)).map(x->x*2).collect(Collectors.toList());
        System.out.println(ans);
    }
}
