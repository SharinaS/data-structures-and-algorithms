package code401Challenges.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayReverseTest {

    @Test
    public void reverseAnArrayAndMakeNewArray1() {
        int[] testArr = {1,2,3,4,5};
        int[] goodAnswer = {5,4,3,2,1};
        assertArrayEquals("Should get downwards counting numbers",
                goodAnswer,
                ArrayReverse.reverseAnArrayAndMakeNewArray(testArr));
    }

    @Test
    public void reverseAnArrayAndMakeNewArray() {
        int[] testArr = {1,2,3,4,5,6,7,8};
        int[] goodAnswer = {8,7,6,5,4,3,2,1};
        assertArrayEquals("Should get downwards counting numbers",
                goodAnswer,
                ArrayReverse.reverseAnArrayAndMakeNewArray(testArr));
    }
}