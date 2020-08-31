package dk.bank.stm.numeral.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.constant.LetterConstant;
import dk.bank.exception.InvalidRomanNumeralException;

public class LetterC extends RomanNumeral {

    public LetterC() {
        this.letter = LetterConstant.LETTER_C;
    }
    @Override
    public int doConversion(RomanNumeral previousLetter, int currentDigit) throws InvalidRomanNumeralException {
        String letter = previousLetter.letter;
        switch (letter) {
            case LetterConstant.LETTER_I:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
            case LetterConstant.LETTER_V:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
            case LetterConstant.LETTER_X:
                return currentDigit - DigitConstant.TEN + DigitConstant.ONE_HUNDRED - DigitConstant.TEN;
            case LetterConstant.LETTER_L:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
            case LetterConstant.LETTER_C:
                return  currentDigit + DigitConstant.ONE_HUNDRED;
            case LetterConstant.LETTER_D:
                return  currentDigit + DigitConstant.ONE_HUNDRED;
            case LetterConstant.LETTER_M:
                return  currentDigit + DigitConstant.ONE_HUNDRED;
            case LetterConstant.LETTER_START:
                return  currentDigit + DigitConstant.ONE_HUNDRED;
            default:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
        }
    }
}
