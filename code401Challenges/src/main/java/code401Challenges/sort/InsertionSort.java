package code401Challenges.sort;

public class InsertionSort {
    // starting code from https://www.baeldung.com/java-insertion-sort
    public static void insertionSort(int[] input) {
        for(int i = 1; i < input.length; i++) {
            int key = input[i];
            int follower = i-1;

            while (follower >= 0 && input[follower] > key) {
                input[follower + 1] = input[follower];
                follower = follower-1;
            }
            input[follower + 1] = key;
        }
    }
}
