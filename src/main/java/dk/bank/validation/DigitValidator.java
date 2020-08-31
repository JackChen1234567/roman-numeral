package dk.bank.validation;

import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;

public class DigitValidator {
    public static void validate(String digit) throws InvalidDigitException, ExceedRomanNumeralLimitException {
        int digitAfterParse;
        try {
            digitAfterParse = Integer.parseInt(digit);
        } catch (NumberFormatException e) {
            throw new InvalidDigitException(digit + " is not valid digit");
        }
        if (digitAfterParse > 3999 || digitAfterParse < 1) {
            throw new ExceedRomanNumeralLimitException(digit + " exceed the limitation of roman numeral");
        }
    }
}
