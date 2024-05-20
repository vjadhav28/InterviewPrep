package org.example.Java8;

import java.util.Arrays;
import java.util.stream.IntStream;
//Parallel Stream takes benefits of all available CPU cores and processes the tasks in parallel.
// If the number of tasks exceeds the number of cores, then remaining tasks wait for currently running task to complete.

public class Java8ParallelStreamMain {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("Using Sequential Stream");
        System.out.println("==================");
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        IntStream intstr = Arrays.stream(arr);
        intstr.forEach(s->
                System.out.println(s+" "+Thread.currentThread().getName()));
        System.out.println("=================================");
        System.out.println("Using Parallel Stream");
        System.out.println("=================================");
        IntStream parallel = Arrays.stream(arr).parallel();
        parallel.forEach(s->
                System.out.println(s+" "+Thread.currentThread().getName()));


    }
}
