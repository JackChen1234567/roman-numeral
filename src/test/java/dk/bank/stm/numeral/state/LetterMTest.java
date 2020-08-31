package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterMTest {
    @Test
    public void doConversionTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterM = LetterFactory.createLetter("M");

        int currentDigit = letterM.doConversion(LetterFactory.createLetter("C"), 100);
        assertEquals(900, currentDigit);

        currentDigit = letterM.doConversion(LetterFactory.createLetter("S"), 0);
        assertEquals(1000, currentDigit);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void doConversionTestException() throws Exception {
        RomanNumeral letterD = LetterFactory.createLetter("M");
        letterD.doConversion(LetterFactory.createLetter("I"), 0);
    }
}
