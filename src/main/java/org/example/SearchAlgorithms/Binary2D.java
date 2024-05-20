package org.example.SearchAlgorithms;

import java.util.Arrays;

public class Binary2D {

    static int[] binarySearch(int[][] arr, int num)
    {
        int row= arr.length;
        int col= arr[0].length;
        int i=0; int last= (row*col) -1;

        while (i<=last)
        {
            int mid= (i + (last-1))/2;
            int C = mid % col;
            int R = mid/col;
            int val = arr[C][R];
            if(val == num)
                return new int[] { R, C};

            if(val < num) {
                i = mid + 1;
            }
            else
                last= mid-1;
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        int[] res= binarySearch(arr, 7);
        System.out.println(Arrays.toString(res));

    }
}
