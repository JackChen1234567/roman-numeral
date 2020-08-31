package dk.bank.rest;

import dk.bank.dto.HistoryDto;
import dk.bank.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3000)
@RequestMapping("/api/v1/histories")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<HistoryDto>> getHistory() {
        List<HistoryDto> historyDtos = historyService.getHistories();
        return ResponseEntity.ok(historyDtos);
    }
}
