package dk.bank.stm.numeral;

import dk.bank.constant.LetterConstant;

import dk.bank.exception.InvalidRomanNumeralException;
import dk.bank.stm.numeral.state.LetterFactory;
import dk.bank.stm.numeral.state.RomanNumeral;
import lombok.Data;


@Data
public class NumeralStateMachine {
    private RomanNumeral previousLetter;
    private RomanNumeral currentLetter;
    private int digit;

    public NumeralStateMachine() throws InvalidRomanNumeralException {
        currentLetter = LetterFactory.createLetter(LetterConstant.LETTER_START);
        digit = 0;
    }

    public void doConversion(String letter) throws InvalidRomanNumeralException {
        previousLetter = currentLetter;
        currentLetter = previousLetter.getNextLetter(letter);
        digit = currentLetter.doConversion(previousLetter,digit);
    }
}
