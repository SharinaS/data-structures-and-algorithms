package code401Challenges.array;

// Use binary search to find the index of a given integer within an array, called key.
// Resource: https://www.geeksforgeeks.org/binary-search-bisect-in-python/
// Resource: Wikipedia's Binary Search article
public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        // establish the beginning and ending of the array
        int start = 0;
        int end = arr.length-1;

        // loop runs until the start reaches the end of the array
        while (start <= end ){

            // set mid to be the value between start and end
            int mid = (start + end) / 2;

            // checks if key is equiv to the midpoint, or if it's greater or lesser than midpoint
            if (arr[mid] == key){
                return mid;
            } else if(key < arr[mid]) {
                end = mid-1;
            } else if(key > arr[mid]) {
                start = mid + 1;
            }

        } return -1;
    }
}
