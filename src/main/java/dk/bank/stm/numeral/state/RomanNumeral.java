package dk.bank.stm.numeral.state;

import dk.bank.exception.InvalidRomanNumeralException;

public abstract class RomanNumeral {
    protected String letter;

    public RomanNumeral getNextLetter(String letter) throws InvalidRomanNumeralException {
        return LetterFactory.createLetter(letter);
    }

    public abstract int doConversion(RomanNumeral previousLetter, int currentDigit) throws InvalidRomanNumeralException;
}
