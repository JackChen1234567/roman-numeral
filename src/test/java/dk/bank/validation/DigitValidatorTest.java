package dk.bank.validation;

import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;
import org.junit.Test;

public class DigitValidatorTest {
    @Test(expected = InvalidDigitException.class)
    public void testNotValidDigit() throws InvalidDigitException, ExceedRomanNumeralLimitException {
        DigitValidator.validate("ee");
    }

    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void testExceedLimitationDigit0() throws InvalidDigitException, ExceedRomanNumeralLimitException {
        DigitValidator.validate("0");
    }
    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void testExceedLimitationDigitNegative1() throws InvalidDigitException, ExceedRomanNumeralLimitException {
        DigitValidator.validate("-1");
    }
    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void testExceedLimitationDigit4000() throws InvalidDigitException, ExceedRomanNumeralLimitException {
        DigitValidator.validate("4000");
    }
    @Test
    public void testValidDigit() throws InvalidDigitException, ExceedRomanNumeralLimitException {
        DigitValidator.validate("11");
    }
}

