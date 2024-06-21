package org.example.Java8.Stream;

import lombok.Getter;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@Getter
class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor, getters and setters
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + '}';
    }
}

public class MaxSortBy {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 60000),
                new Employee("Bob", "HR", 75000),
                new Employee("Charlie", "Engineering", 90000),
                new Employee("David", "Engineering", 85000),
                new Employee("Eve", "Engineering", 95000),
                new Employee("Frank", "Sales", 55000),
                new Employee("Grace", "Sales", 45000)
        );

        Map<String, Optional<Employee>> maxSalariesByDept = employees.stream()
                .collect(groupingBy(
                        Employee::getDepartment,
                        maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        maxSalariesByDept.forEach((department, employee) ->
                System.out.println("Department: " + department + ", Employee with Max Salary: " + employee.get())
        );
//aproach 1 max by salary and group by department
        Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> employeeMap = employees.stream().
                collect(
                        groupingBy(Employee::getDepartment,
                                Collectors.
                                        reducing(
                                                BinaryOperator.maxBy(compareBySalary))));

        System.out.println("Max"+employeeMap);
//approach 2
        Map<String, Employee> employeeMap1 = employees.stream().
                collect(
                        groupingBy(
                                Employee::getDepartment,
                                collectingAndThen(maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
        System.out.println("Max"+employeeMap1);

//        List<Employee> res = employees.stream()
//                .filter(e -> e.getSalary() < 500000)
//                .map(e-> e.getSalary((e.getSalary()*0.1)+e.getSalary())
//                        .sorted(Comparator.comparing(Employee::getName).reversed())
//                        .collect(Collectors.toList()));
    }
}
