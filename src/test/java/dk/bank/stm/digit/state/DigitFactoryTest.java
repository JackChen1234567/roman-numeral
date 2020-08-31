package dk.bank.stm.digit.state;

import dk.bank.constant.DigitConstant;
import dk.bank.constant.ErrorMessage;
import dk.bank.exception.InvalidDigitException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DigitFactoryTest {
    @Test
    public void createUnitsMTestSuccessful() throws InvalidDigitException {
        Digit units = DigitFactory.createDigit(DigitConstant.ONE);
        assertTrue(Units.class.isInstance(units));
    }

    @Test
    public void createTensMTestSuccessful() throws InvalidDigitException {
        Digit tens = DigitFactory.createDigit(DigitConstant.TWO);
        assertTrue(Tens.class.isInstance(tens));
    }

    @Test
    public void createHundredsMTestSuccessful() throws InvalidDigitException {
        Digit hundreds = DigitFactory.createDigit(DigitConstant.THREE);
        assertTrue(Hundreds.class.isInstance(hundreds));
    }

    @Test
    public void createThousandsTestSuccessful() throws InvalidDigitException {
        Digit thousands = DigitFactory.createDigit(DigitConstant.FOUR);
        assertTrue(Thousands.class.isInstance(thousands));
    }

    @Test(expected = InvalidDigitException.class)
    public void createDigitTestException() throws InvalidDigitException {
        Digit digit = DigitFactory.createDigit(DigitConstant.ZERO);
    }
    @Test
    public void createDigitTestExceptionMessage()  {
        try {
             DigitFactory.createDigit(DigitConstant.ZERO);
        } catch (InvalidDigitException e) {
            assertEquals(ErrorMessage.NO_SUCH_DIGIT_FOR_ROMAN_NUMERAL, e.getMessage());
        }
    }
}
