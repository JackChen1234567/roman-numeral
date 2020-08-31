package dk.bank.validation;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

public class RomanNumeralValidatorTest {
    @Test(expected = InvalidRomanNumeralException.class)
    public void testInvalidRomanNumeralException1() throws InvalidRomanNumeralException {
        RomanNumeralValidator.validate("yt");
    }
    @Test(expected = InvalidRomanNumeralException.class)
    public void testInvalidRomanNumeralException2() throws InvalidRomanNumeralException {
        RomanNumeralValidator.validate("11");
    }
    @Test(expected = InvalidRomanNumeralException.class)
    public void testInvalidRomanNumeralException3() throws InvalidRomanNumeralException {
        RomanNumeralValidator.validate("I6");
    }
    @Test(expected = InvalidRomanNumeralException.class)
    public void testInvalidRomanNumeralException4() throws InvalidRomanNumeralException {
        RomanNumeralValidator.validate("MMMM");
    }
    @Test
    public void testValidRomanNumeral() throws InvalidRomanNumeralException {
        RomanNumeralValidator.validate("II");
    }
}
