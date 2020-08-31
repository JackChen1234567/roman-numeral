package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;

public class Thousands implements Digit {
     @Override
    public String doConversion(String digit) throws InvalidDigitException, ExceedRomanNumeralLimitException {
        int actualDigit = Integer.parseInt(digit);
        switch (actualDigit) {
            case DigitConstant.ONE:
                return "M";
            case DigitConstant.TWO:
                return "MM";
            case DigitConstant.THREE:
                return "MMM";
            case DigitConstant.FOUR:
                throw new ExceedRomanNumeralLimitException(ErrorMessage.EXCEED_THE_MAX_LIMIT_OF_ROMAN_NUMERAL);
            case DigitConstant.FIVE:
                throw new ExceedRomanNumeralLimitException(ErrorMessage.EXCEED_THE_MAX_LIMIT_OF_ROMAN_NUMERAL);
            case DigitConstant.SIX:
                throw new ExceedRomanNumeralLimitException(ErrorMessage.EXCEED_THE_MAX_LIMIT_OF_ROMAN_NUMERAL);
            case DigitConstant.SEVEN:
                throw new ExceedRomanNumeralLimitException(ErrorMessage.EXCEED_THE_MAX_LIMIT_OF_ROMAN_NUMERAL);
            case DigitConstant.EIGHT:
                throw new ExceedRomanNumeralLimitException(ErrorMessage.EXCEED_THE_MAX_LIMIT_OF_ROMAN_NUMERAL);
            case DigitConstant.NINE:
                throw new ExceedRomanNumeralLimitException(ErrorMessage.EXCEED_THE_MAX_LIMIT_OF_ROMAN_NUMERAL);
            case DigitConstant.ZERO:
                return "";
            default:
                throw new InvalidDigitException(ErrorMessage.NO_SUCH_DIGIT_FOR_ROMAN_NUMERAL);
        }
    }
}
