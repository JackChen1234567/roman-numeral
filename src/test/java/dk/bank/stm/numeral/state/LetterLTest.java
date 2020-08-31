package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterLTest {
    @Test
    public void doConversionTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterL = LetterFactory.createLetter("L");

        int currentDigit = letterL.doConversion(LetterFactory.createLetter("X"), 10);
        assertEquals(40, currentDigit);

        currentDigit = letterL.doConversion(LetterFactory.createLetter("S"), 0);
        assertEquals(50, currentDigit);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void doConversionTestException() throws Exception {
        RomanNumeral letterL = LetterFactory.createLetter("L");
        letterL.doConversion(LetterFactory.createLetter("I"), 0);
    }
}
