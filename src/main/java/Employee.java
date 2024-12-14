import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;


@Getter
@ToString
public class Employee {
    String emp_name;
    int salary ;

    public Employee(String emp_name, int salary, String department_name) {
        this.emp_name = emp_name;
        this.salary = salary;
        this.department_name = department_name;
    }

    String department_name;

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Varsha", 3000 , "IT"),
                new Employee("Akshay", 2500 , "IT"),
                new Employee("Mansi", 2000 , "IT"),
                new Employee("Karan", 3500 , "HR"),
                new Employee("Arti", 3000 , "HR"),
                new Employee("Shubham", 1000 , "HR"),
                new Employee("Kavita", 3200 , "Admin"),
                new Employee("Vallabh", 3500 , "Admin"),
                new Employee("Maya", 1500 , "Admin"),
                new Employee("Svita", 3200 , "IT"));

        Map<String,List<Employee>> l = list.stream().collect(Collectors.groupingBy(Employee::getDepartment_name));
        System.out.println(l);

        Map<String, Optional<Employee>> res =
                list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment_name,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(res);

        Map<String,Optional<Employee>> max= list.stream().collect(Collectors
                .groupingBy(Employee::getDepartment_name,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(max);

        Map<String, Double> avg= list.stream().collect(Collectors
                .groupingBy(Employee::getDepartment_name,
                        Collectors.averagingInt(Employee::getSalary)));
        System.out.println(avg);

        list.stream().collect(Collectors.groupingBy(Employee::getDepartment_name,Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue()).get();

        DoubleSummaryStatistics summaryStatistics=
                list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(summaryStatistics);

        System.out.println("Highest salary dept wise:: \n" + list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment_name,Collectors.collectingAndThen(Collectors.toList(),
                        a-> a.stream().max(Comparator.comparingDouble(Employee::getSalary))))));

        Optional high=list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(1).findFirst();
        System.out.println("second highest"+high);

        list.stream().map(Employee::getDepartment_name).distinct().forEach(System.out::println);

        Map<String,Long> s = list.stream().collect(Collectors.groupingBy(Employee::getDepartment_name,Collectors.counting()));
        System.out.println(s);
    }
}
