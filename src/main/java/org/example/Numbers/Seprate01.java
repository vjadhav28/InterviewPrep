package org.example.Numbers;

import java.util.Arrays;

public class Seprate01 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1};
        int[] sepratedarr = seprate(arr);
        System.out.println(Arrays.toString(sepratedarr));
    }

    public static int[] seprate(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            int left = 0;
            int right = arr.length-1;
            while(arr[left] == 0)
            {
                left++;
            }
            while(arr[right] == 1)
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
