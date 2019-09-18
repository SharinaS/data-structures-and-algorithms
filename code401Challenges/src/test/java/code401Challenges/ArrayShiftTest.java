package code401Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {
    //happy path with odd numbered array length
    @Test
    public void testOddLengthArray() {

        int[] goodAnswer = new int[]{1, 2, 8, 3};
        int[] origArr = new int[]{1, 2, 3};
        assertArrayEquals(
                "the new array should be [1, 2, 8, 3]",
                goodAnswer,
                ArrayShift.insertShiftArray(origArr, 8)
        );
    }

    @Test
    public void testEvenLengthArray() {

        int[] goodAnswer = new int[]{1, 2, 80, 3, 4};
        int[] origArr = new int[]{1, 2, 3, 4};
        assertArrayEquals(
                "the new array should be [1, 2, 80, 3, 4]",
                goodAnswer,
                ArrayShift.insertShiftArray(origArr, 80)
        );
    }

    @Test
    public void testABiggerNumber() {

        int[] goodAnswer = new int[]{1, 2, 3, 4, 5, 100, 6, 7, 8, 9};
        int[] origArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(
                "the new array should be [1, 2, 3, 4, 5, 100, 6, 7, 8, 9]",
                goodAnswer,
                ArrayShift.insertShiftArray(origArr, 100)
        );
    }
}