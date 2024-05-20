package org.example.Arrays;

import java.util.Arrays;

public class RotateToLeft {
    /**
 * Rotates the given array to the left by k times.
 *
 * @param arr the input array to be rotated
 * @param k    the number of times the array should be rotated
 */
public static void leftRotation(int[] arr, int k) {
    /**
     * Checks if the rotation is unnecessary.
     * If k is 0 or a multiple of the array length, the function returns without performing any rotation.
     */
    if (k == 0 || k % arr.length == 0)
        return;

    /**
     * Calculates the effective number of rotations.
     * If k is larger than the array length, it is reduced to the remainder of the division by the array length.
     */
    k = k % arr.length;

    /**
     * Rotates the array to the left by k times.
     * This is done by shifting each element of the array to the left by one position,
     * and then placing the first element of the array at the end.
     * This process is repeated k times.
     */
    for (int i = 0; i < k; i++) {
        int firstelement = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = firstelement;
    }
}

    public static void main(String[] args) {
        //Initialize array
        int[] arr = {1,2,3,4,5};

        //k determines the number of times an array is to be rotated
        int k = 3;

        System.out.println("Original Array");
        //Displays the original array
        System.out.println(Arrays.toString(arr));

        //Calls the left rotation function
        leftRotation(arr,k);

        //Displays the rotated array
        System.out.println("Reversed Array");
        System.out.println(Arrays.toString(arr));

    }
}
