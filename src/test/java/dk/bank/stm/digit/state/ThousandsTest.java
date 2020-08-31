package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThousandsTest {
    @Test
    public void doConversion1000TestSuccessful() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.ONE));
        assertEquals("M", romanNumeral);
    }

    @Test
    public void doConversion2000TestSuccessful() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.TWO));
        assertEquals("MM", romanNumeral);
    }

    @Test
    public void doConversion3000TestSuccessful() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.THREE));
        assertEquals("MMM", romanNumeral);
    }

    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void doConversion4000TestException() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.FOUR));
    }

    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void doConversion5000TestException() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.FIVE));
    }

    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void doConversion6000TestException() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.SIX));
    }

    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void doConversion7000TestException() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.SEVEN));
    }

    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void doConversion8000TestException() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.EIGHT));
    }

    @Test(expected = ExceedRomanNumeralLimitException.class)
    public void doConversion9000TestException() throws Exception {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(DigitConstant.NINE));
    }

    @Test
    public void doConversion9000TestExceptionMessage() throws InvalidDigitException {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        try {
            thousands.doConversion(String.valueOf(DigitConstant.NINE));
        } catch (Exception e) {
            assertEquals(ErrorMessage.EXCEED_THE_MAX_LIMIT_OF_ROMAN_NUMERAL, e.getMessage());
        }
    }

    @Test(expected = InvalidDigitException.class)
    public void doConversionTestException() throws InvalidDigitException, ExceedRomanNumeralLimitException {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        String romanNumeral = thousands.doConversion(String.valueOf(11));
    }
}
