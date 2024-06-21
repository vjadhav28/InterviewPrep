package org.example.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableEg {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"abc","computer"));
        list.add(new Student(9,"cbg","history"));
        list.add(new Student(6,"hahs","geography"));
        list.add(new Student(4,"kkk","computer"));
        list.add(new Student(3,"kkk","geography"));
        list.add(new Student(5,"cbg","history"));

        System.out.println("BEFORE SORTING"+list);
        Collections.sort(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("AFTER SORTING"+ list);
    }
}
