package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.exception.InvalidDigitException;

public class Units implements Digit {
    @Override
    public String doConversion(String digit) throws InvalidDigitException {
        int actualDigit = Integer.parseInt(digit);
        switch (actualDigit) {
            case DigitConstant.ONE:
                return "I";
            case DigitConstant.TWO:
                return "II";
            case DigitConstant.THREE:
                return "III";
            case DigitConstant.FOUR:
                return "IV";
            case DigitConstant.FIVE:
                return "V";
            case DigitConstant.SIX:
                return "VI";
            case DigitConstant.SEVEN:
                return "VII";
            case DigitConstant.EIGHT:
                return "VIII";
            case DigitConstant.NINE:
                return "IX";
            case DigitConstant.ZERO:
                return "";
            default:
                throw new InvalidDigitException(ErrorMessage.NO_SUCH_DIGIT_FOR_ROMAN_NUMERAL);
        }
    }
}
