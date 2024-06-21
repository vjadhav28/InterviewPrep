package org.example.Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Rearrange0 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,7,2,1,5,6,0,2,11,4,0,56,0);

        List<Integer> rearrangedList = list.stream()
                .sorted(Comparator.comparingInt(a -> a == 0 ? 0 : 2))  // Sort with zeroes first (-1)
                .collect(Collectors.toList());

        System.out.println(rearrangedList);

    }
}
