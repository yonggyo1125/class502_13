package member.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
public class Member {
    @Id
    private long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime regDt;
}
