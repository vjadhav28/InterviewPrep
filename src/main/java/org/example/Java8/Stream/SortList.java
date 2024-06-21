package org.example.Java8.Stream;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.Comparator.Student;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class SortList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "abc", "computer"));
        list.add(new Student(9, "cbg", "history"));
        list.add(new Student(6, "hahs", "geography"));
        list.add(new Student(4, "kkk", "computer"));
        list.add(new Student(3, "kkk", "geography"));
        list.add(new Student(5, "cbg", "history"));

        List<Employee> employees = Arrays.asList(
                new Employee("John", "New York", 5000),
                new Employee("Jane", "New York", 6000),
                new Employee("Bob", "Chicago", 4500),
                new Employee("Alice", "Chicago", 5500),
                new Employee("Sam", "San Francisco", 7000),
                new Employee("Emily", "San Francisco", 6500),
                new Employee("John", "Chicago", 5500),
                new Employee("Jane", "San Francisco", 6500),
                new Employee("Bob", "San Francisco", 7000)
        );
        //Find the occurrence of names of employees from the List<Employee>, and find the frequency of each name.

        Map<String,Integer> namefreq = new HashMap<>();
        for(Employee emp : employees)
        {
            String name = emp.getName();
            namefreq.put(name, namefreq.getOrDefault(name,0)+1);
        }
        System.out.println(namefreq);

        //Find the employee count in each department in the employee
        // list using Java 8 Stream API.
      //  Stream<Employee> employeeStream = employees.stream();
        //Map<String, Long> empCnt = employeeStream.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
// Print the results.

    //    Map<String, Long> empCnt = employeeStream.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        List<Employee> employees = Arrays.asList(
//                new Employee("John", "New York", 5000),
//                new Employee("Jane", "New York", 6000),
//                new Employee("Bob", "Chicago", 4500),
//                new Employee("Alice", "Chicago", 5500),
//                new Employee("Sam", "San Francisco", 7000),
//                new Employee("Emily", "San Francisco", 6500)
//        );

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double avg = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average = "+ avg);
        //Sort list ascending
//        list.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
//        //Sort list descending
//        list.stream().sorted(Comparator.comparing(Student::getBranch).reversed()).forEach(System.out::print);

//        list.stream().filter(i-> Collections.frequency(list,i.getBranch())>1)
//                .distinct()
//                .forEach(System.out::println);

        //Find the highest salary of an employee from the HR department using Java stream API.
        Optional<Student> res =list.stream().filter(i->i.getBranch().equalsIgnoreCase("history")).max(Comparator.comparing(Student::getId));
        System.out.println(res);

//        Map<String,Student> res1 =
//        list.stream()
//                .collect(
//                        Collectors.groupingBy(Student::getBranch),
//                        collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getId)), Optional::get));
//
//        Optional<Map<String, Student>> res2 = list.stream()
//                .collect(Collectors.groupingBy(Student::getBranch,
//                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Student::getId)))));


    }
}

