package dk.bank.service;


import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;
import dk.bank.exception.InvalidRomanNumeralException;
import dk.bank.stm.digit.DigitStateMachine;
import dk.bank.stm.numeral.NumeralStateMachine;
import org.springframework.stereotype.Service;

@Service
public class RomanNumeralAndDigitConversionService {

    public int convertRomanNumeralToDigit(String romanNumeral) throws InvalidRomanNumeralException {
        String[] strArray = romanNumeral.split("");
        NumeralStateMachine stm = new NumeralStateMachine();
        for (String letter : strArray) {
            stm.doConversion(letter);
        }
        return stm.getDigit();
    }


    public String convertDigitToRomanNumeral(String digit) throws InvalidDigitException, ExceedRomanNumeralLimitException {
        String[] digitArray = digit.split("");
        DigitStateMachine stm = new DigitStateMachine();
        for (int index = 0; index < digitArray.length; index++) {
            stm.setCurrentDigit(digitArray.length - index);
            stm.doConversion(digitArray[index]);
        }
        return stm.getRomanNumeral();
    }
}
