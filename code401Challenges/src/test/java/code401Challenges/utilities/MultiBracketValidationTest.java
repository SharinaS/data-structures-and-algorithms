package code401Challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    // Tests # 3 and # 7 are still failing

    @Test
    public void multiBracketValidation() {
        MultiBracketValidation testMultiB = new MultiBracketValidation();
        assertTrue(testMultiB.multiBracketValidation("[hello there]"));
    }

    @Test
    public void multiBracketValidation2() {
        MultiBracketValidation testMultiB = new MultiBracketValidation();
        assertTrue(testMultiB.multiBracketValidation("[[{}]]"));
    }

    @Test
    public void multiBracketValidation3() {
        MultiBracketValidation testMultiB = new MultiBracketValidation();

        assertFalse(testMultiB.multiBracketValidation("[({}]"));
    }

    @Test
    public void multiBracketValidation4() {
        MultiBracketValidation testMultiB = new MultiBracketValidation();
        assertFalse(testMultiB.multiBracketValidation("["));
    }

    @Test
    public void multiBracketValidation5() {
        MultiBracketValidation testMultiB = new MultiBracketValidation();
        assertFalse(testMultiB.multiBracketValidation("}"));
    }

    @Test
    public void multiBracketValidation6() {
        MultiBracketValidation testMultiB = new MultiBracketValidation();
        assertTrue(testMultiB.multiBracketValidation("()[[eeeep]]()"));
    }

    @Test
    public void multiBracketValidation7() {
        MultiBracketValidation testMultiB = new MultiBracketValidation();
        assertFalse(testMultiB.multiBracketValidation("{(})"));
    }

}