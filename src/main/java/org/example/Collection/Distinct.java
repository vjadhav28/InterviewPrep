package org.example.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Distinct {

    public static void main(String []args){
        List<Integer> number = Arrays.asList(3,6,2,3,5,6,1,4);

       number.stream()
               .filter(i-> Collections.frequency(number,i)==1)
               .forEach(System.out::println);

        number.stream().distinct().forEach(i->System.out.println("Sec"+i));

    }
}