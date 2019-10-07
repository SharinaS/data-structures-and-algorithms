package code401Challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {



    @Test
    public void multiBracketValidation() {
        assertTrue(MultiBracketValidation.multiBracketValidation("[hello there]"));
    }

    @Test
    public void multiBracketValidation2() {
        assertTrue(MultiBracketValidation.multiBracketValidation("[[{}]]"));
    }

    @Test
    public void multiBracketValidation3() {
        assertFalse(MultiBracketValidation.multiBracketValidation("[({}]"));
    }

    @Test
    public void multiBracketValidation4() {
        assertFalse(MultiBracketValidation.multiBracketValidation("["));
    }

    @Test
    public void multiBracketValidation5() {
        assertFalse(MultiBracketValidation.multiBracketValidation("}"));
    }

    @Test
    public void multiBracketValidation6() {
        assertTrue(MultiBracketValidation.multiBracketValidation("()[[eeeep]]()"));
    }

    @Test
    public void multiBracketValidation7() {
        assertFalse(MultiBracketValidation.multiBracketValidation("{(})"));
    }

}