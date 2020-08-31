package dk.bank.service;

import dk.bank.dto.HistoryDto;
import dk.bank.entity.History;
import dk.bank.mapper.HistoryMapper;
import dk.bank.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {
    @Autowired
    private HistoryRepository historyRepository;

    public void saveHistory(HistoryDto historyDto) {
        History history = HistoryMapper.INSTANCE.dtoToEntity(historyDto);
        historyRepository.save(history);
    }

    public List<HistoryDto> getHistories() {
        List<History> histories = historyRepository.findAll();
        List<HistoryDto> historyDtos = new ArrayList<>();
        histories.forEach(history ->
                historyDtos.add(HistoryMapper.INSTANCE.entityToDto(history))
        );
        return historyDtos;
    }
}
