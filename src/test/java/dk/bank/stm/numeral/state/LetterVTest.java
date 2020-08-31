package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterVTest {

    @Test
    public void doConversionTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterV = LetterFactory.createLetter("V");

        int currentDigit = letterV.doConversion(LetterFactory.createLetter("I"), 1);
        assertEquals(4, currentDigit);

        currentDigit = letterV.doConversion(LetterFactory.createLetter("S"), 0);
        assertEquals(5, currentDigit);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void doConversionTestException() throws Exception {
        RomanNumeral letterV = LetterFactory.createLetter("V");
        letterV.doConversion(LetterFactory.createLetter("V"), 0);
    }
}
