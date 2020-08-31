package dk.bank.service;

import dk.bank.dto.HistoryDto;
import dk.bank.entity.History;
import dk.bank.enums.ConversionType;
import dk.bank.repository.HistoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class HistoryServiceTest {
    @Mock
    private HistoryRepository historyRepository;

    @InjectMocks
    private HistoryService service;
    @Test
    public void testGetHistory() {
        List<History> historyList = mockHistories();
        doReturn(historyList).when(historyRepository).findAll();
        List<HistoryDto> histories = service.getHistories();
        assertEquals(1,histories.size());
        assertEquals("2",histories.get(0).getInput());
        assertEquals("II",histories.get(0).getOutput());
        assertEquals(new Long(1),histories.get(0).getHistoryId());
        assertEquals(ConversionType.DIGITTOROMANNUMERAL.getValue(),histories.get(0).getConversionType());
        assertEquals("2020-08-28T00:00:36+02:00",histories.get(0).getCreated());
    }

    private List<History> mockHistories() {
        List<History> histories = new ArrayList<>();
        History history = new History();
        history.setOutput("II");
        history.setInput("2");
        history.setConversionType(ConversionType.DIGITTOROMANNUMERAL.getValue());
        history.setHistoryId(new Long(1));
        history.setCreated(ZonedDateTime.parse("2020-08-28T00:00:36+02:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        histories.add(history);
        return histories;
    }
}
