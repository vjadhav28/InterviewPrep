package org.example.Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        //only display numbers that occur more than once
        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4});

        numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);

        //skip first 4 elements and display the rest
        Stream.of(1,4,2,5,6,6,6,6).skip(2).forEach(System.out::print);

        //create for loop using iterate
        Stream.iterate(0,i->i+1).filter(i->i%2==0).limit(10).forEach(i->System.out.print(i + ""));

        //
        List<String> subs = Stream.of("we", "are", "the", "champions")
                        .skip(1)
                        .map(element -> element.substring(0, 1))
                        .collect(Collectors.toList());
        System.out.println(subs);

        //distinct will print only distinct values.i.e. wont consider duplicate values
        Stream.of('s','d','i','s','h','d').distinct().forEach(System.out::print);

        Stream.iterate(0, i -> i + 1) //runs 10 times because of limit
                .limit(10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::print);

        //
        Map<Boolean, List<Integer>> partBy =
                Stream
                        .of(1, 4, 5)
                        .collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        System.out.println("partitionby");
        System.out.println(partBy);

        //
        Map<Object, List<Integer>> groupBy =
                Stream
                        .of(1, 4, 5)
                        .collect(Collectors.groupingBy(integer -> integer/2));
        System.out.println("groupby");
        System.out.println(groupBy);

        //
        Stream<Integer> integerStream = Stream.of(3, 2, 1, 4, 5);
        integerStream.sorted(); // 1, 2, 3, 4, 5
        System.out.println(integerStream.toString());


    }
}

//        //delete duplicates
//        for(int i=0; i < arr.length;i++)
//        {
//            for(int j= i+1; i < arr.length ;j++)
//            {
//                if(arr[j]==arr[i])
//                {
//                  arr[j] = arr[j+1];
//
//                }
//            }
//            System.out.println(arr);
//        }
//        //sorting
//        int temp ;
//        for(int i=0; i<arr.length;i++)
//        {
//            for(int j= i+1; i<arr.length;j++)
//            {
//                if(arr[j]<arr[i])
//                {
//                     temp = arr[j];
//                    arr[j]= arr[i];
//                    arr[i]=temp;
//                }
//            }
//        }
//    }
//}


//   id ,name , sal and department

//List<Integer,String> res = Employee.stream().sorted(comparator.comparing(Employee::getDepartment),
// RESOURCE.Comparator.groupingBy(Employee::getDepartment)).collect(Collectors.toList());
