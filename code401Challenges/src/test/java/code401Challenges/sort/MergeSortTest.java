package code401Challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    // test for sorting an array with 6 values
    @Test
    public void mergeSort() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    // test for sorting an array with descending values
    @Test
    public void mergeSort2() {
        int[] actual = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    // test sorting an array with only one value
    @Test
    public void mergeSort3() {
        int[] actual = {6};
        int[] expected = {6};
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    // test sorting an array that contains negative number
    @Test
    public void mergeSort4() {
        int[] actual = {6, -2, 4, 0};
        int[] expected = {-2, 0, 4, 6};
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }
}