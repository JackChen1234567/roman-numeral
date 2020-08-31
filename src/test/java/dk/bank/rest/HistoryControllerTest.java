package dk.bank.rest;

import dk.bank.dto.HistoryDto;
import dk.bank.enums.ConversionType;
import dk.bank.service.HistoryService;
import dk.bank.service.RomanNumeralAndDigitConversionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HistoryControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HistoryService service;

    @MockBean
    private RomanNumeralAndDigitConversionService romanNumeralAndDigitConversionService;

    @Test
    public void testGetHistoriesAPI() throws Exception {
        HistoryDto dto = HistoryDto.builder()
                .input("1")
                .output("I")
                .historyId(new Long(1))
                .conversionType(ConversionType.DIGITTOROMANNUMERAL.getValue())
                .created("2020-08-28T00:00:36+02:00").build();
        List<HistoryDto> historyDtoList = new ArrayList<>();
        historyDtoList.add(dto);
        doReturn(historyDtoList).when(service).getHistories();
        this.mockMvc.perform(get("/api/v1/histories")).andExpect(status().isOk());
    }
}
