package board.entities;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BoardData {
    private long seq;
    private String subject;
    private String content;
    private String poster;
    private LocalDateTime regDt;
}
