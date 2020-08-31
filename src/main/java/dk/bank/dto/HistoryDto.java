package dk.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryDto {
    private Long historyId;
    private String input;
    private String output;
    private String conversionType;
    private String created;
}
