package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SqrOfAll {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Optional<Integer> sumOfAll = numbers.stream().reduce(Integer::sum);
        List<Integer> sqrOfAll = numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(sqrOfAll);
        System.out.println(sumOfAll);
        int num = 10;
        long factorialResult = 1L;
        for(int i = 1; i <= num; ++i)
        {
            factorialResult *= i;
        }
        System.out.println("Factorial: "+factorialResult);
    }
}
