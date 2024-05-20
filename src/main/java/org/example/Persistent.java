package org.example;

import java.util.Arrays;
import java.util.List;

public class Persistent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        //d = 2 Output: 3 4 5 6 7 1 2
   //  Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2 Output: 5 6 7 1 2 3 4

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    //    List<Integer> rotatedList

        int size = arr.length;
        int d = 2 ;

        for(int i = 0 ; i < size ; i++)
        {
            if(i == 0)
            {
                int temp = arr[size-d] ;
                arr[size-d] = arr[i];
            }
            else if (i == 1)
            {
                arr[size-(d-1)] = arr[i];
            }
            else
                arr[i-2]= arr[i];
        }
        System.out.println(Arrays.toString(arr));


    }
}
