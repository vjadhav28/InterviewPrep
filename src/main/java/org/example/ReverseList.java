package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,15,5,20,25);

       List<Integer> asc = num.stream().sorted().limit(4).collect(Collectors.toList());
        System.out.println(asc);
       int sum_asc= 0;
        for (Integer integer : asc) {
            sum_asc = sum_asc + integer;
        }
        System.out.println(sum_asc);

        Iterator<Integer> rir = new LinkedList<>(num).descendingIterator();
        List<Integer> copy = new ArrayList<>();
        while (rir.hasNext())
            copy.add(rir.next());
        System.out.println("Reverse"+copy);
    }
}
