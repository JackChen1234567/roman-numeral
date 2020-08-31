package dk.bank.rest;

import dk.bank.dto.HistoryDto;
import dk.bank.enums.ConversionType;
import dk.bank.exception.BadRequestException;
import dk.bank.exception.InvalidRomanNumeralException;
import dk.bank.service.HistoryService;
import dk.bank.service.RomanNumeralAndDigitConversionService;
import dk.bank.validation.RomanNumeralValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(maxAge = 3000)
@RequestMapping("/api/v1/digits")
public class RomanNumeralToDigitController {
    @Autowired
    private RomanNumeralAndDigitConversionService romanNumeralAndDigitConversionService;
    @Autowired
    private HistoryService historyService;

    @GetMapping(path = "/{romanNumeral}", produces = "application/json")
    public ResponseEntity<Integer> getDigits(@PathVariable String romanNumeral) throws BadRequestException, InvalidRomanNumeralException {
        validateRomanNumeral(romanNumeral);
        int digit;
        try {
            digit = romanNumeralAndDigitConversionService.convertRomanNumeralToDigit(romanNumeral);
            saveHistory(romanNumeral, Integer.toString(digit));
        } catch (InvalidRomanNumeralException e) {
            throw new BadRequestException(e.getMessage());
        }
        return ResponseEntity.ok(digit);
    }

    private void validateRomanNumeral(String romanNumeral) throws BadRequestException {
        try {
            RomanNumeralValidator.validate(romanNumeral);
        } catch (InvalidRomanNumeralException e) {
            throw new BadRequestException(e.getMessage());
        }
    }

    private void saveHistory(String romanNumeral, String digits) {
        HistoryDto history = new HistoryDto();
        history.setInput(romanNumeral);
        history.setOutput(digits);
        history.setConversionType(ConversionType.ROMANNUMERALTODIGIT.getValue());
        historyService.saveHistory(history);
    }
}
