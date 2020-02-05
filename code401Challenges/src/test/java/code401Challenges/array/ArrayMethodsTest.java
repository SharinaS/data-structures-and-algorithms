package code401Challenges.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMethodsTest {

    @Test
    public void findDigitsWithEvenNumberLengthsInArray1() {
        int[] nums = {22, 368, 6, 1, 989898};
        assertEquals("Two numbers should have a length that is an even number value",
                2,
                ArrayMethods.findDigitsWithEvenNumberLengthsInArray(nums));
    }

    @Test
    public void findDigitsWithEvenNumberLengthsInArray2() {
        int[] nums = {400, 600, 3, 5, 9};
        assertEquals("Zero digits should have a length that is an even number value",
                0,
                ArrayMethods.findDigitsWithEvenNumberLengthsInArray(nums));
    }

    @Test
    public void findDigitsWithEvenNumberLengthsInArray3() {
        int[] nums = {};
        assertEquals("The array is empty",
                0,
                ArrayMethods.findDigitsWithEvenNumberLengthsInArray(nums));
    }

    @Test
    public void findDigitsWithEvenNumberLengthsInArray4() {
        int[] nums = {22, 33, 44, 55, 66, 77, 88};
        assertEquals("Seven digits should have a length that is an even number value",
                7,
                ArrayMethods.findDigitsWithEvenNumberLengthsInArray(nums));
    }

    @Test
    public void checkForAPairOf2AndPairOf4_1() {
        int[] nums = {1,2,2};
        assertTrue("output should be true",
                ArrayMethods.checkForAPairOf2AndPairOf4(nums));
    }

    @Test
    public void checkForAPairOf2AndPairOf4_2() {
        int[] nums = {1,5,91,4,4,100};
        assertTrue("output should be true",
                ArrayMethods.checkForAPairOf2AndPairOf4(nums));
    }

    @Test
    public void checkForAPairOf2AndPairOf4_3() {
        int[] nums = {3,4,4,8,10,2,2};
        assertFalse("output should be false b/c there are both pairs of 2 and 4 in array",
                ArrayMethods.checkForAPairOf2AndPairOf4(nums));
    }

    @Test
    public void checkForAPairOf2AndPairOf4_4() {
        int[] nums = {3,4,5,2,8,4,9};
        assertFalse("output should be false because there are no pairs of 2s or 4s next to each other",
                ArrayMethods.checkForAPairOf2AndPairOf4(nums));
    }
}