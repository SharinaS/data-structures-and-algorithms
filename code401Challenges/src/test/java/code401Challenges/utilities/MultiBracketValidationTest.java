package code401Challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public boolean multiBracketValidation() {
        String testInput = "[()]";
        assertEquals("something", true,
                multiBracketValidation(testInput)); //<-------- same issue as for animalshelter test
    }
}