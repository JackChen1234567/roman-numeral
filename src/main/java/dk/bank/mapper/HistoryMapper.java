package dk.bank.mapper;

import dk.bank.dto.HistoryDto;
import dk.bank.entity.History;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Mapper
public interface HistoryMapper {
    HistoryMapper INSTANCE = Mappers.getMapper(HistoryMapper.class);
    @Mapping(target = "created", expression = "java(format(history.getCreated()))")
    HistoryDto entityToDto(History history);

    @Mapping(target = "historyId", ignore = true)
    @Mapping(target = "created", ignore = true)
    History dtoToEntity(HistoryDto bo);

    default String format(ZonedDateTime dataTime) {
        if (dataTime!=null)
            return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dataTime);
        else return "";
    }
}
