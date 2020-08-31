package dk.bank.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name="HISTORY")
@Data
public class History {
    @Id
    @Column(name="HISTORY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyId;

    @Column(name="INPUT")
    private String input;

    @Column(name="OUTPUT")
    private String output;

    @Column(name="CONVERSION_TYPE")
    private String conversionType;

    @Column(name="CREATED")
    private ZonedDateTime created;
}
