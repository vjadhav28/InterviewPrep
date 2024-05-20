package org.example.Numbers;

import java.util.Arrays;

public class separate0s1sSolution1 {
    public static void main(String[] args) {
        int[] array = {0,1,0,1,1,0,1,1,1,1,1};
        int[] result = separate0s1s(array);
        System.out.println(Arrays.toString(result));
    }


    public static int[] separate0s1s(int[] arr)
    {
        return Seprate01.seprate(arr);
    }
}
