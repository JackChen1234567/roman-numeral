package dk.bank.stm.numeral.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.LetterConstant;

public class LetterI extends RomanNumeral {
    public LetterI() {
        this.letter = LetterConstant.LETTER_I;
    }

    @Override
    public int doConversion(RomanNumeral previousLetter, int currentDigit) {
        return currentDigit + DigitConstant.ONE;
    }
}
