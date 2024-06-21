package org.example;

import java.util.Arrays;

public class Reorder01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,1,0,1,0};
        int[] result = reorganize01(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] reorganize01(int[] arr) {
        for (int ignored : arr)
        {
            int left =0;
            int right= arr.length-1;
            while(arr[left]==0)
            {
                left++;
            }
            while(arr[right]==1)
            {
                right--;
            }
            if(left<right)
            {
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }
}