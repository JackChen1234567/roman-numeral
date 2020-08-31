package dk.bank.stm.digit.state;

import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;

public interface Digit {

    public String doConversion(String digit) throws InvalidDigitException, ExceedRomanNumeralLimitException;
}
