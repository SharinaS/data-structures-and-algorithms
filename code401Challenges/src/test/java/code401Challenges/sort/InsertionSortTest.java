package code401Challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] input = {6, 2, 3, 4, 5, 1};
        InsertionSort.insertionSort(input);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals("the two arrays are not equal", expected, input);
    }

    @Test
    public void testInsertionSort2() {
        int[] input = {6};
        InsertionSort.insertionSort(input);
        int[] expected = {6};
        assertArrayEquals("the two arrays are not equal", expected, input);
    }

    @Test
    public void testInsertionSort3() {
        int[] input = {6, 6, 4, 4, 4};
        InsertionSort.insertionSort(input);
        int[] expected = {4, 4, 4, 6, 6};
        assertArrayEquals("the two arrays are not equal", expected, input);
    }
}