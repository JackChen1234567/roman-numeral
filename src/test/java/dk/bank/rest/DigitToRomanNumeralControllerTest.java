package dk.bank.rest;

import dk.bank.exception.ExceedRomanNumeralLimitException;
import dk.bank.service.HistoryService;
import dk.bank.service.RomanNumeralAndDigitConversionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class DigitToRomanNumeralControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private HistoryService service;
    @MockBean
    private RomanNumeralAndDigitConversionService romanNumeralAndDigitConversionService;

    @Test
    public void testConvertDigitToRomanNumeralAPI() throws Exception {
        doReturn("I").when(romanNumeralAndDigitConversionService).convertDigitToRomanNumeral(anyString());
        this.mockMvc.perform(get("/api/v1/roman-numerals/1")).andExpect(status().isOk());
    }
    @Test
    public void testConvertDigitToRomanNumeralAPIException() throws Exception {
        doThrow(ExceedRomanNumeralLimitException.class).when(romanNumeralAndDigitConversionService).convertDigitToRomanNumeral(anyString());
        this.mockMvc.perform(get("/api/v1/roman-numerals/4000")).andExpect(status().isBadRequest());
    }
}
