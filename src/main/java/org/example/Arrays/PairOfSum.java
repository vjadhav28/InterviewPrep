package org.example.Arrays;

public class PairOfSum {
    public static void main(String[] args)
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int K = 6;
        // Function Call
        getPairsCount(arr, K);
    }

    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int K)
    {
        // Initialize result
        int count = 0;

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == K) {
                    System.out.println("Pair is "+arr[i]+" and "+arr[j]);
                    count++;
                }
            }
        }

        System.out.printf("Count of pairs is %d", count);
    }
}