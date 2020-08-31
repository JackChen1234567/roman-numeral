package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.exception.InvalidDigitException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TensTest {
    @Test
    public void doConversion10TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.ONE));
        assertEquals("X", romanNumeral);
    }

    @Test
    public void doConversion20TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.TWO));
        assertEquals("XX", romanNumeral);
    }

    @Test
    public void doConversion30TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.THREE));
        assertEquals("XXX", romanNumeral);
    }

    @Test
    public void doConversion40TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.FOUR));
        assertEquals("XL", romanNumeral);
    }

    @Test
    public void doConversion50TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.FIVE));
        assertEquals("L", romanNumeral);
    }

    @Test
    public void doConversion60TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.SIX));
        assertEquals("LX", romanNumeral);
    }

    @Test
    public void doConversion70TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.SEVEN));
        assertEquals("LXX", romanNumeral);
    }

    @Test
    public void doConversion80TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.EIGHT));
        assertEquals("LXXX", romanNumeral);
    }

    @Test
    public void doConversion90TestSuccessful() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(DigitConstant.NINE));
        assertEquals("XC", romanNumeral);
    }

    @Test(expected = InvalidDigitException.class)
    public void doConversionTestException() throws Exception {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        String romanNumeral = tens.doConversion(String.valueOf(11));

    }
}
