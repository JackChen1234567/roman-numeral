package dk.bank.service;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RomanNumeralToDigitTest {

    private HashMap<String, Integer> testData;

    @Test
    public void testRomanNumeralToDigit() throws Exception {

        testEachCase("I", 1);
        testEachCase("II", 2);
        testEachCase("III", 3);
        testEachCase("IV", 4);
        testEachCase("V", 5);
        testEachCase("VI", 6);
        testEachCase("VII", 7);
        testEachCase("VIII", 8);
        testEachCase("IX", 9);
        testEachCase("X", 10);
        testEachCase("XI", 11);
        testEachCase("XIV", 14);
        testEachCase("XIX", 19);
        testEachCase("XX", 20);
        testEachCase("XXIV", 24);
        testEachCase("XXIX", 29);
        testEachCase("XXX", 30);
        testEachCase("XL", 40);
        testEachCase("L", 50);
        testEachCase("LX", 60);
        testEachCase("LXX", 70);
        testEachCase("LXXX", 80);
        testEachCase("XC", 90);
        testEachCase("C", 100);
        testEachCase("CI", 101);
        testEachCase("CIV", 104);
        testEachCase("CIX", 109);
        testEachCase("CC", 200);
        testEachCase("CCI", 201);
        testEachCase("CCIV", 204);
        testEachCase("CCIX", 209);
        testEachCase("CCC", 300);
        testEachCase("CD", 400);
        testEachCase("D", 500);
        testEachCase("DC", 600);
        testEachCase("DCC", 700);
        testEachCase("DCCC", 800);
        testEachCase("CM", 900);
        testEachCase("M", 1000);
        testEachCase("MCXI", 1111);
        testEachCase("MCXIV", 1114);
        testEachCase("MCXIX", 1119);
        testEachCase("MM", 2000);
        testEachCase("MMM", 3000);
        testEachCase("MCMIII", 1903);
        testEachCase("MCMXCVII", 1997);
    }

    private void testEachCase(String originalRomanNumeral, Integer expectedDigit) throws Exception {
        RomanNumeralAndDigitConversionService conversionService = new RomanNumeralAndDigitConversionService();
        assertEquals("expected value is: " + expectedDigit.toString(), expectedDigit.intValue(), conversionService.convertRomanNumeralToDigit(originalRomanNumeral));
    }

}
