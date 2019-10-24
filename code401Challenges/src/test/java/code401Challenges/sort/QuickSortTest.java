package code401Challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    // Check array of size 6
    @Test
    public void quickSort() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    // Check array of size 1
    @Test
    public void quickSort2() {
        int[] actual = {5};
        int[] expected = {5};
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    // Check array of size 5
    @Test
    public void quickSort3() {
        int[] actual = {5, 1, 6, 2, 3};
        int[] expected = {1, 2, 3, 5, 6};
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    // Check descending array
    @Test
    public void quickSort4() {
        int[] actual = {6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6};
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    // Test array with negative numbers
    @Test
    public void quickSort5() {
        int[] actual = {-3, 7, 3, -1, -2};
        int[] expected = {-3, -2, -1, 3, 7};
        QuickSort.quickSort(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }
}