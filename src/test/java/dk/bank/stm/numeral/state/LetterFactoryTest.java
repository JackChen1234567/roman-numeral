package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LetterFactoryTest {
    @Test
    public void createLetterITestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterI = LetterFactory.createLetter("i");
        assertTrue(LetterI.class.isInstance(letterI));
        letterI = LetterFactory.createLetter("I");
        assertTrue(LetterI.class.isInstance(letterI));
    }

    @Test
    public void createLetterVTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterV = LetterFactory.createLetter("V");
        assertTrue(LetterV.class.isInstance(letterV));
        letterV = LetterFactory.createLetter("v");
        assertTrue(LetterV.class.isInstance(letterV));
    }

    @Test
    public void createLetterXTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterX = LetterFactory.createLetter("x");
        assertTrue(LetterX.class.isInstance(letterX));
        letterX = LetterFactory.createLetter("X");
        assertTrue(LetterX.class.isInstance(letterX));
    }

    @Test
    public void createLetterLTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterL = LetterFactory.createLetter("l");
        assertTrue(LetterL.class.isInstance(letterL));
        letterL = LetterFactory.createLetter("L");
        assertTrue(LetterL.class.isInstance(letterL));
    }
    @Test
    public void createLetterCTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterC = LetterFactory.createLetter("c");
        assertTrue(LetterC.class.isInstance(letterC));
        letterC = LetterFactory.createLetter("C");
        assertTrue(LetterC.class.isInstance(letterC));
    }

    @Test
    public void createLetterDTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterD = LetterFactory.createLetter("d");
        assertTrue(LetterD.class.isInstance(letterD));
        letterD = LetterFactory.createLetter("D");
        assertTrue(LetterD.class.isInstance(letterD));
    }


    @Test
    public void createLetterMTestSuccessful() throws InvalidRomanNumeralException {
        RomanNumeral letterM = LetterFactory.createLetter("m");
        assertTrue(LetterM.class.isInstance(letterM));
        letterM = LetterFactory.createLetter("M");
        assertTrue(LetterM.class.isInstance(letterM));
    }

    @Test(expected = InvalidRomanNumeralException.class)
    public void createLetterTestException() throws InvalidRomanNumeralException {
        RomanNumeral letterK = LetterFactory.createLetter("k");
    }
}
