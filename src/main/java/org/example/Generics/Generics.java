package org.example.Generics;

import java.util.Arrays;

/*Generics means parameterized types. Generics allow you to create classes, interfaces, and methods that operate on types specified as
 parameters.Using generics, you can write code that works with different types while enforcing compile-time type safety.
 */
public class Generics {
    public static void main(String[] args) {
        Integer[] i = {1,3,8,11};
        Character[] c= {'a', 'b', 'c', 'd', 'e'};
        String[] s = {"apple", "orange", "mango","banana"};

        System.out.println("Sorted integer array: ");
        bubbleSort(i);

        System.out.println("Sorted character array: ");
        bubbleSort(c);

        System.out.println("Sorted String array: ");
        bubbleSort(s);
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length -1 ; i++){
            for (int j = 0; j < arr.length -i-1 ; j++){
                swap(j,j+1,arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void swap(int i, int j, T[] arr){
        T t= arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
