package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.exception.InvalidDigitException;

public class Hundreds implements Digit {
    @Override
    public String doConversion(String digit) throws InvalidDigitException {
        int actualDigit = Integer.parseInt(digit);
        switch (actualDigit) {
            case DigitConstant.ONE:
                return "C";
            case DigitConstant.TWO:
                return "CC";
            case DigitConstant.THREE:
                return "CCC";
            case DigitConstant.FOUR:
                return "CD";
            case DigitConstant.FIVE:
                return "D";
            case DigitConstant.SIX:
                return "DC";
            case DigitConstant.SEVEN:
                return "DCC";
            case DigitConstant.EIGHT:
                return "DCCC";
            case DigitConstant.NINE:
                return "CM";
            case DigitConstant.ZERO:
                return "";
            default:
                throw new InvalidDigitException(ErrorMessage.NO_SUCH_DIGIT_FOR_ROMAN_NUMERAL);
        }
    }
}
