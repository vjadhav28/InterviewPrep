package org.example.Comparator;

import java.util.*;
import java.util.stream.Collectors;

public class CustomComparatorEg {
    public static void main(String[] args) {
        Student s = new Student(1,"abc","co");

        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"abc","computer"));
        list.add(new Student(9,"cbg","history"));
        list.add(new Student(6,"hahs","geography"));
        list.add(new Student(4,"kkk","computer"));
        list.add(new Student(3,"kkk","geography"));
        list.add(new Student(5,"cbg","history"));

        Optional<Student> eldestFootballer = list.stream()
                .max(Comparator.comparing(Student::getBranch));
        System.out.println("eldestFootballer" + eldestFootballer);

        List<Student> sorted = list.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
        System.out.println("Sorted lis is "+ sorted);

        Map<String, Set<String>> groupByBranch = list.stream().
                collect(Collectors.groupingBy(
                        Student::getBranch,
                TreeMap::new,Collectors.mapping(Student::getName,Collectors.toSet())));

        System.out.println(groupByBranch);

        Map<Integer, List<String>> employeeNamesByAge = list.stream()
                .collect(Collectors.groupingBy(
                                Student::getId,
                                Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(employeeNamesByAge);

        System.out.println("BEFORE SORTING = " + list);

        Collections.sort(list,new NameComparator());
        System.out.println(list);

        Collections.sort(list,new IDComparator());
        System.out.println(list);

    }
}
