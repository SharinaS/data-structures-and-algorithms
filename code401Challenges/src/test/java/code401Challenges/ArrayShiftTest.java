package code401Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    // == checks an odd-numbered array length
    @Test
    public void testOddLengthArray() {

        int[] goodAnswer = new int[]{1, 2, 8, 3};
        int[] origArr = new int[]{1, 2, 3};

        //System.out.println(ArrayShift.insertShiftArray(origArr, 8));

        assertArrayEquals(
                "the new array should be [1, 2, 8, 3]",
                goodAnswer,
                ArrayShift.insertShiftArray(origArr, 8)
        );
    }

    // checks an array with an even-length of elements
    @Test
    public void testEvenLengthArray() {

        int[] goodAnswer = new int[]{1, 2, 80, 3, 4};
        int[] arrToTest = new int[]{1, 2, 3, 4};
        assertArrayEquals(
                "the new array should be [1, 2, 80, 3, 4]",
                goodAnswer,
                ArrayShift.insertShiftArray(arrToTest, 80)
        );
    }

    // tests a longer array
    @Test
    public void testABiggerNumber() {

        int[] goodAnswer = new int[]{1, 2, 3, 4, 5, 100, 6, 7, 8, 9};
        int[] arrToTest = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(
                "the new array should be [1, 2, 3, 4, 5, 100, 6, 7, 8, 9]",
                goodAnswer,
                ArrayShift.insertShiftArray(arrToTest, 100)
        );
    }
}