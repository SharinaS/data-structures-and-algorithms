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
}