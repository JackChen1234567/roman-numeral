package dk.bank.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitToRomanNumberTest {
    @Test
    public void testDigitToRomanNumeral() throws Exception {
        testEachCase("1", "I");
        testEachCase("2", "II");
        testEachCase("3", "III");
        testEachCase("4", "IV");
        testEachCase("5", "V");
        testEachCase("6", "VI");
        testEachCase("7", "VII");
        testEachCase("8", "VIII");
        testEachCase("9", "IX");
        testEachCase("10", "X");
        testEachCase("11", "XI");
        testEachCase("14", "XIV");
        testEachCase("19", "XIX");
        testEachCase("20", "XX");
        testEachCase("24", "XXIV");
        testEachCase("29", "XXIX");
        testEachCase("30", "XXX");
        testEachCase("40", "XL");
        testEachCase("50", "L");
        testEachCase("60", "LX");
        testEachCase("70", "LXX");
        testEachCase("80", "LXXX");
        testEachCase("90", "XC");
        testEachCase("100", "C");
        testEachCase("101", "CI");
        testEachCase("104", "CIV");
        testEachCase("109", "CIX");
        testEachCase("200", "CC");
        testEachCase("201", "CCI");
        testEachCase("204", "CCIV");
        testEachCase("209", "CCIX");
        testEachCase("300", "CCC");
        testEachCase("400", "CD");
        testEachCase("500", "D");
        testEachCase("600", "DC");
        testEachCase("700", "DCC");
        testEachCase("800", "DCCC");
        testEachCase("900", "CM");
        testEachCase("1000", "M");
        testEachCase("1111", "MCXI");
        testEachCase("1114", "MCXIV");
        testEachCase("1119", "MCXIX");
        testEachCase("2000", "MM");
        testEachCase("3000", "MMM");
        testEachCase("1903", "MCMIII");
        testEachCase("1997", "MCMXCVII");
    }


    private void testEachCase(String originaldigit, String expectedRomanNumeral) throws Exception {
        RomanNumeralAndDigitConversionService conversionService = new RomanNumeralAndDigitConversionService();

        assertEquals("expected value is: " + expectedRomanNumeral, expectedRomanNumeral, conversionService.convertDigitToRomanNumeral(originaldigit));
    }
}
