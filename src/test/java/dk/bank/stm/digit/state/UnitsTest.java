package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.exception.InvalidDigitException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitsTest {
    @Test
    public void doConversion1TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.ONE));
        assertEquals("I", romanNumeral);
    }
    @Test
    public void doConversion2TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.TWO));
        assertEquals("II", romanNumeral);
    }
    @Test
    public void doConversion3TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.THREE));
        assertEquals("III", romanNumeral);
    }
    @Test
    public void doConversion4TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.FOUR));
        assertEquals("IV", romanNumeral);
    }
    @Test
    public void doConversion5TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.FIVE));
        assertEquals("V", romanNumeral);
    }
    @Test
    public void doConversion6TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.SIX));
        assertEquals("VI", romanNumeral);
    }
    @Test
    public void doConversion7TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.SEVEN));
        assertEquals("VII", romanNumeral);
    }
    @Test
    public void doConversion8TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.EIGHT));
        assertEquals("VIII", romanNumeral);
    }
    @Test
    public void doConversion9TestSuccessful() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        String romanNumeral = units.doConversion(String.valueOf(DigitConstant.NINE));
        assertEquals("IX", romanNumeral);
    }

    @Test(expected = InvalidDigitException.class)
    public void doConversionTestException() throws Exception {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        //only 1-9 for one digit, 10 will be invalid
        units.doConversion(String.valueOf(10));
    }
}
