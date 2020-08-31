package dk.bank.stm.numeral.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.constant.LetterConstant;
import dk.bank.exception.InvalidRomanNumeralException;

public class LetterM extends RomanNumeral{
    public LetterM() {
        this.letter = LetterConstant.LETTER_M;
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
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
            case LetterConstant.LETTER_L:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
            case LetterConstant.LETTER_C:
                return currentDigit - DigitConstant.ONE_HUNDRED + DigitConstant.ONE_THOUSAND - DigitConstant.ONE_HUNDRED ;
            case LetterConstant.LETTER_D:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
            case LetterConstant.LETTER_M:
                return  currentDigit + DigitConstant.ONE_THOUSAND;
            case LetterConstant.LETTER_START:
                return  currentDigit + DigitConstant.ONE_THOUSAND;
            default:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
        }
    }
}
