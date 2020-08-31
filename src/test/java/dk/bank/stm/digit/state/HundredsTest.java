package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HundredsTest {
    @Test
    public void doConversion100TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.ONE));
        assertEquals("C", romanNumeral);
    }
    @Test
    public void doConversion200TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.TWO));
        assertEquals("CC", romanNumeral);
    }
    @Test
    public void doConversion300TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.THREE));
        assertEquals("CCC", romanNumeral);
    }
    @Test
    public void doConversion400TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.FOUR));
        assertEquals("CD", romanNumeral);
    }
    @Test
    public void doConversion500TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.FIVE));
        assertEquals("D", romanNumeral);
    }
    @Test
    public void doConversion600TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.SIX));
        assertEquals("DC", romanNumeral);
    }
    @Test
    public void doConversion700TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.SEVEN));
        assertEquals("DCC", romanNumeral);
    }
    @Test
    public void doConversion800TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.EIGHT));
        assertEquals("DCCC", romanNumeral);
    }
    @Test
    public void doConversion900TestSuccessful() throws Exception {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(DigitConstant.NINE));
        assertEquals("CM", romanNumeral);
    }

    @Test(expected = InvalidDigitException.class)
    public void doConversionTestException() throws InvalidDigitException, ExceedRomanNumeralLimitException {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        String romanNumeral = hundreds.doConversion(String.valueOf(11));

    }
}
