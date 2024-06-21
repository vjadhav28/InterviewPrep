package org.example;

import java.util.Arrays;
import java.util.List;

public class RotatetoLeft
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));

        //d = 2 Output: 3 4 5 6 7 1 2
   //  Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2 Output: 5 6 7 1 2 3 4
        int size = arr.length;
        int d = 2 ;

        int[] rotatedArr = new int[size];

        // Copy the rotated elements to the temporary array
        for (int i = 0; i < size; i++) {
            rotatedArr[(i + size -d) % size] = arr[i];
        }

        // Copy the rotated elements back to the original array
        System.arraycopy(rotatedArr, 0, arr, 0, size);

        System.out.println(Arrays.toString(arr));

//        for(int i = 0 ; i < size ; i++)
//        {
//            if(i == 0)
//            {
//                int temp = arr[size-d] ;
//                arr[size-d] = arr[i];
//            }
//            else if (i == 1)
//            {
//                arr[size-(d-1)] = arr[i];
//            }
//            else
//                arr[i-2]= arr[i];
//        }
//        System.out.println(Arrays.toString(arr));


    }
}
