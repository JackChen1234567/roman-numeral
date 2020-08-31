package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.exception.InvalidDigitException;

public class DigitFactory {
    public static Digit createDigit(int index) throws InvalidDigitException {

        switch (index) {
            case DigitConstant.ONE:
                return new Units();
            case DigitConstant.TWO:
                return new Tens();
            case DigitConstant.THREE:
                return new Hundreds();
            case DigitConstant.FOUR:
                return new Thousands();
            default:
                throw new InvalidDigitException(ErrorMessage.NO_SUCH_DIGIT_FOR_ROMAN_NUMERAL);
        }
    }
}
