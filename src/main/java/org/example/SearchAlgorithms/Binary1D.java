package org.example.SearchAlgorithms;

public class Binary1D {

    /**
 * This method performs a binary search on a sorted 1D array.
 *
 * @param arr The sorted array to be searched.
 * @param l The starting index of the array.
 * @param size The ending index of the array.
 * @param number The number to be searched in the array.
 * @return The index of the number in the array if found, otherwise returns the number itself.
 */
static int binarySearch(int[] arr, int l, int size, int number)
{
    // Check if the size is greater than or equal to the starting index
    if(size >= l)
    {
        int mid = (l+size)/2; // Calculate the middle index

        // If the element is present at the middle itself
        if(arr[mid]==number)
        {
            return mid; // Return the middle index
        }

        // If element is smaller than mid, then it can only be present in left sub-array
        if(arr[mid]>number)
        {
            return binarySearch(arr, mid, size, number); // Recursive call for the left sub-array
        }
        else
            return binarySearch(arr, l, mid, number); // Recursive call for the right sub-array
    }
    return number; // Return the number itself if not found
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
