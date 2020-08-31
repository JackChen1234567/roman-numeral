package dk.bank.validation;

import dk.bank.exception.InvalidRomanNumeralException;

public class RomanNumeralValidator {
    public static void validate(String romanNumeral) throws InvalidRomanNumeralException {
        // here only validate if input string are roman numeral letters
        // in the state machine validate more
        String romanNumeralLetters = "IVXLCDMivxlcdm";
        String[] strArray = romanNumeral.split("");

        //there is special case MMMM is invalid, the state machine can not handle. so handle here
        int mLetterCounter = 0;
        boolean previousLetterIsM = false;

        for (String str : strArray) {
            if (romanNumeralLetters.indexOf(str) == -1) {
                throw new InvalidRomanNumeralException(romanNumeral + " is not valid roman numeral");
            }
            //there is special case MMMM is invalid, the state machine can not handle. so handle here
            if (str.equals("m") || str.equals("M")) {
                if (previousLetterIsM) {
                    mLetterCounter = mLetterCounter + 1;
                } else {
                    mLetterCounter = 1;
                    previousLetterIsM = true;
                }
                if (mLetterCounter >= 4) {
                    throw new InvalidRomanNumeralException(romanNumeral + " is not valid roman numeral ");
                }
            } else {
                previousLetterIsM = false;
            }
        }
    }
}
