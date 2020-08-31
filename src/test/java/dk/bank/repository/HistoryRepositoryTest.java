package dk.bank.repository;

import dk.bank.entity.History;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class HistoryRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private HistoryRepository historyRepository;

    private String expectedInput="1";
    private String expectedOutput="I";
    private String expectedConversionType="DigitToRomanNumeral";

    @Test
    public void testPersistHistory() {
        History history = createHistory();
        history = entityManager.persist(history);
        History historyNew = historyRepository.getHistoryByHistoryId(history.getHistoryId());
        assertEquals(expectedInput,historyNew.getInput());
        assertEquals(expectedOutput,historyNew.getOutput());
        assertEquals(expectedConversionType,historyNew.getConversionType());
    }

    @Test
    public void testHistoryPageable() {
        History history = createHistory();
        entityManager.persist(history);
        history =createHistory2();
        entityManager.persist(history);
        history =createHistory3();
        entityManager.persist(history);
        Pageable paging = PageRequest.of(0, 2);
        Page<History> historyPage = historyRepository.findAll(paging);
        List<History> histories = historyPage.getContent();
        assertEquals(2, histories.size());
        paging = PageRequest.of(1, 2);
        historyPage = historyRepository.findAll(paging);
        histories = historyPage.getContent();
        assertEquals(1, histories.size());
    }


    private History createHistory3() {
        History history = new History();
        history.setConversionType(expectedConversionType);
        history.setInput("II");
        history.setOutput("2");
        return history;
    }
    private History createHistory2() {
        History history = new History();
        history.setConversionType(expectedConversionType);
        history.setInput("III");
        history.setOutput("3");
        return history;
    }
    private History createHistory() {
        History history = new History();
        history.setConversionType(expectedConversionType);
        history.setInput(expectedInput);
        history.setOutput(expectedOutput);
        return history;
    }

}
