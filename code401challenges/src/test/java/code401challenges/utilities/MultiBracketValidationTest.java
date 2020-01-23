package code401challenges.utilities;

import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidationTestTrue() {
        assertEquals(true, multiBracketValidation("()"));
        assertTrue(multiBracketValidation("[]"));
        assertTrue(multiBracketValidation("{}"));
        assertTrue(multiBracketValidation("([{}])"));

    }
    @Test
    public void multiBracketValidationTestFalse() {
        assertFalse(multiBracketValidation("(}"));
        assertFalse(multiBracketValidation("[)))))]"));
        assertFalse(multiBracketValidation("{)}"));
    }
}