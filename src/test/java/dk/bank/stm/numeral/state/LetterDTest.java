package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterDTest {

    @Test
    public void doConversionTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterD = LetterFactory.createLetter("D");

        int currentDigit = letterD.doConversion(LetterFactory.createLetter("C"), 100);
        assertEquals(400, currentDigit);

        currentDigit = letterD.doConversion(LetterFactory.createLetter("S"), 0);
        assertEquals(500, currentDigit);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void doConversionTestException() throws InvalidRomanNumeralException {
        RomanNumeral letterD = LetterFactory.createLetter("D");
        letterD.doConversion(LetterFactory.createLetter("I"), 0);
    }
}
