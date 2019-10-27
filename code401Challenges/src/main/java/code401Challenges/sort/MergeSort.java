package code401Challenges.sort;

import java.util.Arrays;

// See also Michelle's solution: https://github.com/codefellows/seattle-java-401d6/blob/master/class-28/MergeSort.java
// Discussed on Wed, Oct 23
// Michelle's is elegant, and the one I'm most a fan of! This version replaces original array with updated sorted
// values, instead of making a new array

//public class MergeSortFromMichelle {
//    public static void main(String[] args) {
//        int[] toBeSorted = new int[]{5,2,7,12,6,4,9,3,1,-5};
//        System.out.println(Arrays.toString(mergeSort(toBeSorted)));
//    }
//
//    public static int[] mergeSort(int[] input) {
//        if (input.length < 2) {
//            return input;
//        } else {
//            return merge( // copyOfRange copies part of an array
//                    mergeSort(Arrays.copyOfRange(input, 0, input.length / 2)),
//                    mergeSort(Arrays.copyOfRange(input, input.length / 2, input.length)),
//                    input
//            );
//        }
//    }
//
//    public static int[] merge(int[] arr1, int[] arr2, int[] ans) {
//        int i = 0;
//        int j = 0;
//        while (i + j < ans.length) {
//            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
//                ans[i + j] = arr1[i];
//                i++;
//            } else {
//                ans[i + j]  = arr2[j];
//                j++;
//            }
//        }
//        return ans;
//    }
//}

// This solution is good, and works with tests, but less clean feeling than commented out code above
// (which does not have tests written for it yet).
// starting code from: https://www.baeldung.com/java-merge-sort
public class MergeSort {
    public static void mergeSort(int[] arr, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr, mid);
        mergeSort(rightArr, length - mid);

        merge(arr, leftArr, rightArr, mid, length - mid);
    }

    // k refers to i + j
    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
        int i = 0, j = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[i + j] = leftArr[i];
                i++;
            } else {
                arr[i + j] = rightArr[j];
                j++;
            }
        }
        while (i < left) {
            arr[i + j] = leftArr[i];
            i++;
        }
        while (j < right) {
            arr[i + j] = rightArr[j];
            j++;
        }
    }
}
