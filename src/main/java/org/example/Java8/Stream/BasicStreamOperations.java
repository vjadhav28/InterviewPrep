package org.example.Java8.Stream;

import org.example.Comparator.Student;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamOperations {

    public static void main(String[] args) {
        //Stream for maps
        Map<String, String> books = new HashMap<>();
        books.put("123-A", "DS");
        books.put("324-A", "c++");
        books.put("13-B", "Java");
        Optional<String> ans = books.entrySet().stream().
                filter(a -> a.getValue().equalsIgnoreCase("Java")).
                map(Map.Entry::getKey).findFirst();
        System.out.println(ans);



        Optional<String> ans1 = books.entrySet().stream().filter(a->a.getValue().equalsIgnoreCase("ds"))
                .map(Map.Entry::getKey).findFirst();
        System.out.println(ans1);

//        Optional<Student> eldestFootballer = list.stream()
//                .max(Comparator.comparing(Student::getBranch));
//        System.out.println("eldestFootballer " + eldestFootballer);

//        List<Student> sorted = list.stream().sorted(Comparator.comparing(Student::getId)).toList();
//        System.out.println("Sorted lis is "+ sorted);

        //-----------------------------------------------------------------------------------------------------------------------
       //change elememts into uppercase and join using ,
        List<Integer> numbers = Arrays.asList(-1, 3, 5, 7, 9, 2, 4, 6, 8);
        System.out.println("List"+ numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        List<String> names = Arrays.asList("Java", "PHP", "JavaScript", "Python","abba");
        String joinStr = names.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println("joinedList"+ joinStr);

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream() .map(String::toUpperCase) .collect(Collectors.joining(", "));
        System.out.println(G7Countries);
////-----------------------------------------------------------------------------------------------------------------------
//        //The generate method accepts a Supplier instance which is a functional interface.
//        // Here, a lambda expression is passed which generates a random number less than 100.
//        // This code will create a Stream of random integers less than 100.
//
        Stream<Integer> stream = Stream.generate(() -> new Random().nextInt(100)).limit(4);
        System.out.println("he generate method accepts a Supplier instance which is a functional interface.\n" +
                "        // Here, a lambda expression is passed which generates a random number less than 100.\n" +
                "        // This code will create a Stream of random integers less than 100.");
        stream.forEach(System.out::println);
////-----------------------------------------------------------------------------------------------------------------------
//
//        //MAPPING
        List<Integer> mappedList= numbers.stream().map(x->x*2).toList();
        System.out.println("Display square of each element in list"+mappedList);
//
        List<String> mappedString = names.stream().map(x->x.substring(0,3)).toList();
        System.out.println("Display substring of list "+mappedString);
////-----------------------------------------------------------------------------------------------------------------------
//
//        //SORTING
        List<Integer> sortedlist = numbers.stream().sorted().toList();
        System.out.println("Sorted List"+sortedlist);
//
        List<String> sortednames = names.stream().sorted().toList();
        System.out.println("Sorted List"+sortednames);
//        //sorting in desc order
        List<String> desName = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Revered List"+desName);

        List<Integer> rever = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(rever);
////-----------------------------------------------------------------------------------------------------------------------
//
//
//        //Reduce
        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);
        int mul = numbers.stream().reduce(1,(a,b) -> a * b);
        System.out.println(mul);
//
        int sum1 = numbers.stream().filter(a->a%2==0).reduce(0,Integer::sum);
//
        int sum2 = numbers.stream().filter(a-> a%2!=0).reduce(0,Integer::sum);


        numbers.stream().map(x -> x * 2).forEach(x -> System.out.print(x + " "));
        numbers.stream().map(x -> x*3).forEach(x-> System.out.print(x + ","));

////CONSUMER
        Consumer<String> upper = x -> System.out.print(" " + x.toUpperCase());

        Consumer<String> lower = x -> System.out.print(" " + x.toLowerCase());

        Consumer<Integer> sqr = x-> System.out.print(" " + x*2);

        numbers.forEach(sqr);

        names.forEach(lower);

        names.forEach(upper);
    }
}
