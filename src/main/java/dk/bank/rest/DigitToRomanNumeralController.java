package dk.bank.rest;

import dk.bank.dto.HistoryDto;
import dk.bank.enums.ConversionType;
import dk.bank.exception.BadRequestException;
import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.exception.InvalidDigitException;
import dk.bank.service.HistoryService;
import dk.bank.service.RomanNumeralAndDigitConversionService;
import dk.bank.validation.DigitValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 3000)
@RequestMapping("/api/v1/roman-numerals")
public class DigitToRomanNumeralController {

    @Autowired
    private RomanNumeralAndDigitConversionService romanNumeralAndDigitConversionService;
    @Autowired
    private HistoryService historyService;

    @GetMapping(path = "/{digits}", produces = "application/json")
    public ResponseEntity<String> getRomanNumeral(@PathVariable String digits) throws BadRequestException {
        validateDigit(digits);
        String romanNumeral = null;
        try {
            romanNumeral = romanNumeralAndDigitConversionService.convertDigitToRomanNumeral(digits);
            saveHistory(digits, romanNumeral);
        } catch (InvalidDigitException | ExceedRomanNumeralLimitException e) {
            throw new BadRequestException(e.getMessage());
        }
        return ResponseEntity.ok(romanNumeral);
    }

    private void validateDigit(String digits) throws BadRequestException {
        try {
            DigitValidator.validate(digits);
        } catch (InvalidDigitException | ExceedRomanNumeralLimitException e) {
            throw new BadRequestException(e.getMessage());
        }
    }

    private void saveHistory(String digits, String romanNumeral) {
        HistoryDto history = new HistoryDto();
        history.setInput(digits);
        history.setOutput(romanNumeral);
        history.setConversionType(ConversionType.DIGITTOROMANNUMERAL.getValue());
        historyService.saveHistory(history);
    }
}
