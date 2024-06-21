package org.example.Java8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee_1> list = new ArrayList<>() ;
        list.add(new Employee_1("Varsha","Pune"));
        list.add(new Employee_1("Sunil","Pune"));
        list.add(new Employee_1("Rohit","Bangalore"));

        Map<String, List<String>> set= list.stream().
               collect(Collectors.groupingBy(
                       Employee_1::getCity,
                       TreeMap::new,Collectors.mapping(Employee_1::getName,Collectors.toList())));

//        list.stream().
//                collect(Collectors.groupingBy(
//                        Employee_1::getCity,
//                        TreeMap::new,Collectors.mapping(Employee_1::getName,Collectors.toList())));

        System.out.println(set);
    }

}
