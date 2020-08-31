package dk.bank.stm.numeral.state;

import dk.bank.constant.ErrorMessage;
import dk.bank.constant.LetterConstant;
import dk.bank.exception.InvalidRomanNumeralException;

public class LetterFactory {

    public static RomanNumeral createLetter(String letter) throws InvalidRomanNumeralException {
        String upperCaseLetter = letter.toUpperCase();
        switch (upperCaseLetter) {
            case LetterConstant.LETTER_I:
                return new LetterI();
            case LetterConstant.LETTER_V:
                return new LetterV();
            case LetterConstant.LETTER_X:
                return new LetterX();
            case LetterConstant.LETTER_L:
                return new LetterL();
            case LetterConstant.LETTER_C:
                return new LetterC();
            case LetterConstant.LETTER_D:
                return new LetterD();
            case LetterConstant.LETTER_M:
                return new LetterM();
            case LetterConstant.LETTER_START:
                return new Start();
            default:
                throw new InvalidRomanNumeralException(ErrorMessage.INVALID_ROMAN_NUMERAL);
        }
    }
}
