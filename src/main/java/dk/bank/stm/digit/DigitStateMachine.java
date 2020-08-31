package dk.bank.stm.digit;

import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;
import dk.bank.stm.digit.state.Digit;
import dk.bank.stm.digit.state.DigitFactory;
import lombok.Data;

@Data
public class DigitStateMachine {
    private Digit currentDigit;
    private String romanNumeral = "";

    public void setCurrentDigit(int index) throws InvalidDigitException {
        currentDigit = DigitFactory.createDigit(index);
    }

    public void doConversion(String digit) throws InvalidDigitException, ExceedRomanNumeralLimitException {
        romanNumeral = romanNumeral + currentDigit.doConversion(digit);
    }
}
