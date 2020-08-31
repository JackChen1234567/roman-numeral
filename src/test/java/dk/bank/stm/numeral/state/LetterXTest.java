package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterXTest {
    @Test
    public void doConversionTestSuccessful() throws Exception {
        RomanNumeral letterX = LetterFactory.createLetter("X");

        int currentDigit = letterX.doConversion(LetterFactory.createLetter("I"), 1);
        assertEquals(9, currentDigit);

        currentDigit = letterX.doConversion(LetterFactory.createLetter("S"), 0);
        assertEquals(10, currentDigit);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void doConversionTestException() throws Exception {
        RomanNumeral letterX = LetterFactory.createLetter("X");
        letterX.doConversion(LetterFactory.createLetter("V"), 5);
    }
}
