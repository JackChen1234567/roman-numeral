package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LetterITest {
    @Test
    public void doConversionTest() throws InvalidRomanNumeralException {
        RomanNumeral letterI = LetterFactory.createLetter("I");

       int currentDigit = letterI.doConversion(LetterFactory.createLetter("S"),0);
        assertEquals(1,currentDigit);

        currentDigit = letterI.doConversion(LetterFactory.createLetter("V"),5);
        assertEquals(6,currentDigit);
    }
}
