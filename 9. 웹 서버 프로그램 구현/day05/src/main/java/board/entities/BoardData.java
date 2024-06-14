package board.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardData {
    private long seq;
    private String subject;
    private String content;
    private String poster;
    private LocalDateTime regDt;
}
