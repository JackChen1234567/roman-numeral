package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.exception.InvalidDigitException;

public class Tens implements Digit {
    @Override
    public String doConversion(String digit) throws InvalidDigitException {
        int actualDigit = Integer.parseInt(digit);
        switch (actualDigit) {
            case DigitConstant.ONE:
                return "X";
            case DigitConstant.TWO:
                return "XX";
            case DigitConstant.THREE:
                return "XXX";
            case DigitConstant.FOUR:
                return "XL";
            case DigitConstant.FIVE:
                return "L";
            case DigitConstant.SIX:
                return "LX";
            case DigitConstant.SEVEN:
                return "LXX";
            case DigitConstant.EIGHT:
                return "LXXX";
            case DigitConstant.NINE:
                return "XC";
            case DigitConstant.ZERO:
                return "";
            default:
                throw new InvalidDigitException(ErrorMessage.NO_SUCH_DIGIT_FOR_ROMAN_NUMERAL);
        }
    }
}
