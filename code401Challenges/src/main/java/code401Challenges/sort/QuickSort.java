package code401Challenges.sort;

public class QuickSort {

    // starting code from https://www.baeldung.com/java-quicksort
    // takes in an arr to be sorted, and the first and the last index of the array
    public static void quickSort(int[] arr, int begin, int end) {       // <---------- consider doing this with only input of array
        // only continue if there are elements to be sorted
        if (begin < end) {
            // get the index of the sorted pivot and use it to recursively call partition() method with different
            // indices as quickSort() method.
            int pivotIndex = partition(arr, begin, end);

            quickSort(arr, begin, pivotIndex-1);
            quickSort(arr, pivotIndex+1, end);
        }
    }

    // takes the last element as the pivot. Each element is then checked,
    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}
