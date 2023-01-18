package es.menasoft.lambda;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Player {

    private final String name;
    private final String club;
    private LocalDate birthDate;
    private final double handicap;
}
