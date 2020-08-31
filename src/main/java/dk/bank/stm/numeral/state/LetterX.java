package dk.bank.stm.numeral.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.constant.LetterConstant;
import dk.bank.exception.InvalidRomanNumeralException;

public class LetterX extends RomanNumeral{
    public LetterX() {
        this.letter = LetterConstant.LETTER_X;
    }
    @Override
    public int doConversion(RomanNumeral previousLetter, int currentDigit) throws InvalidRomanNumeralException {
        String letter = previousLetter.letter;
        switch (letter) {
            case LetterConstant.LETTER_I:
                return currentDigit - DigitConstant.ONE + DigitConstant.TEN - DigitConstant.ONE;
            case LetterConstant.LETTER_V:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
            case LetterConstant.LETTER_X:
                return  currentDigit + DigitConstant.TEN;
            case LetterConstant.LETTER_L:
                return  currentDigit + DigitConstant.TEN;
            case LetterConstant.LETTER_C:
                return  currentDigit + DigitConstant.TEN;
            case LetterConstant.LETTER_D:
                return  currentDigit + DigitConstant.TEN;
            case LetterConstant.LETTER_M:
                return  currentDigit + DigitConstant.TEN;
            case LetterConstant.LETTER_START:
                return  currentDigit + DigitConstant.TEN;
            default:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
        }
    }
}
