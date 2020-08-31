package dk.bank.stm.numeral.state;

import dk.bank.constant.LetterConstant;

public class Start extends RomanNumeral {
    public Start() {
        this.letter = LetterConstant.LETTER_START;
    }

    @Override
    public int doConversion(RomanNumeral previousLetter, int currentDigit) {
        return 0;
    }
}
