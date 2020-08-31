package dk.bank.rest;

import dk.bank.exception.InvalidRomanNumeralException;
import dk.bank.service.HistoryService;
import dk.bank.service.RomanNumeralAndDigitConversionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RomanNumeralToDigitControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private HistoryService service;
    @MockBean
    private RomanNumeralAndDigitConversionService romanNumeralAndDigitConversionService;

    @Test
    public void testRomanNumeralToDigitRestApi() throws Exception {
        doReturn(1).when(romanNumeralAndDigitConversionService).convertRomanNumeralToDigit(anyString());
        this.mockMvc.perform(get("/api/v1/digits/I")).andExpect(status().isOk());
    }
    @Test
    public void testConvertRomanNumeralToDigitAPIException() throws Exception {
        doThrow(InvalidRomanNumeralException.class).when(romanNumeralAndDigitConversionService).convertRomanNumeralToDigit(anyString());
        this.mockMvc.perform(get("/api/v1/digits/MMMMM")).andExpect(status().isBadRequest());
    }
}
