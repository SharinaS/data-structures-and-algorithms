package code401Challenges.sort;

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

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
