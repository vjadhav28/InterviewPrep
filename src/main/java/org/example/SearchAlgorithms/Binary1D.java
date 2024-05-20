package org.example.SearchAlgorithms;

public class Binary1D {

    static int binarySearch(int[] arr, int l, int size, int number)
    {
        if(size >= l)
        {
            int mid = (l+size)/2;
            // If the element is present at the middle itself
            if(arr[mid]==number)
            {
                return mid;
            }
            // If element is smaller than mid, then it can only be present in left sub-array
            if(arr[mid]>number)
            {
                return binarySearch(arr, mid, size, number);
            }
            else
                return binarySearch(arr, l, mid, number);
        }
        return number;
    }

    public static void main(String[] args) {
        int[] arr = {11,31,45,10,12};
        int l = 0;
        int size = arr.length -1;
        int number= 45;
        int res = binarySearch(arr,l, size,number);
        System.out.println(arr[res]);

    }
}
