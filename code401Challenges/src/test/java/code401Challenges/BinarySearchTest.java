package code401Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    // == checks what happens when there is no key in the array - expects -1
    @Test
    public void testNoKeyInArray() {
        int[] arr = {11,22,33,44,55,66,77};
        assertEquals(
                "the index should be ",
                -1,
                BinarySearch.binarySearch(arr, 90)
        );
    }

    // == checks an even numbered array
    @Test
    public void testFindIndexEvenNumberedArray() {
        int[] arr = new int[]{4,8,15,16,23,42};
        assertEquals(
                "the answer should be 2",
                2,
                BinarySearch.binarySearch(arr, 15)
        );
    }

    // == checks an odd-numbered length array
    @Test
    public void testFindIndexOddNumberedArray() {
        int[] arr = new int[]{4,8,15,16,23,42,56};
        assertEquals(
                "the answer should be 6",
                6,
                BinarySearch.binarySearch(arr, 56)
        );
    }

    // == tests if it handles an array of length 1 appropriately
    @Test
    public void testCheckArraySingleItem() {
        int[] arr = new int[]{1};
        assertEquals(
                "the answer should be 0",
                0,
                BinarySearch.binarySearch(arr, 1)
        );
    }
}