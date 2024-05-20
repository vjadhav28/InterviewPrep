package org.example.Arrays;

public class Bring0toFront {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 44, 0, 7, 0, 2, 0};

        int[] newArray = moveZeroToFront(arr);

        for (int num : newArray) {
            System.out.println(num + " ");
        }
    }

    public static int[] moveZeroToFront(int[] arr)
    {
        int zeroCount = 0;
        for (int num:arr) {
            if (num == 0) {
                zeroCount++;
            }
        }
        int[] newArray = new int[arr.length];
        int index=zeroCount;
        for (int num:arr) {
            if (num != 0) {
                newArray[index++]=num;
            }
        }
        return newArray;
    }

}