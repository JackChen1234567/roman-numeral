package dk.bank.stm.numeral.state;

import dk.bank.constant.ErrorMessage;
import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterCTest {
    @Test
    public void doConversionTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterC = LetterFactory.createLetter("C");

        int currentDigit = letterC.doConversion(LetterFactory.createLetter("X"), 10);
        assertEquals(90, currentDigit);

        currentDigit = letterC.doConversion(LetterFactory.createLetter("S"), 0);
        assertEquals(100, currentDigit);
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void doConversionTestException() throws InvalidRomanNumeralException {
        RomanNumeral letterC = LetterFactory.createLetter("C");
        letterC.doConversion(LetterFactory.createLetter("I"), 0);
    }

    @Test
    public void doConversionTestExceptionMessage() throws InvalidRomanNumeralException {
        RomanNumeral letterC = LetterFactory.createLetter("C");
        try {
            letterC.doConversion(LetterFactory.createLetter("I"), 0);
        } catch (InvalidRomanNumeralException e) {
            assertEquals(ErrorMessage.INVALID_ROMAN_NUMERAL, e.getMessage());
        }
    }
}
