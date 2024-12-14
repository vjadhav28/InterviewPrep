package org.example;

import java.util.Arrays;

public class swap01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,1,0,1,0};
        Arrays.stream(arr).boxed().sorted().forEach(x->System.out.print(" "+ x.toString()));
        int[] res = swap01(arr);
        System.out.println(Arrays.toString(res));
    }
    private static int[] swap01(int[] array)
    {
        for(int i =0 ; i <  array.length ; i++)
        {
           int left = 0;
           int right = array.length -1;

           while(array[i]==0)
           {
               left++;
           }
            while(array[i]==1)
            {
                right--;
            }
            if(left>right){
                int temp = array[left];
                array[left]=array[right];
                array[right]=temp;
            }

        }
        //System.out.println(Arrays.toString(array));
        return array;
    }
}

