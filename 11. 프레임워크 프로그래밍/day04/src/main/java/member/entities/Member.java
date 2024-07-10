package member.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;

@Data
@Builder
public class Member {
    @Id
    @Column("SEQ")
    private long seq;
    @Column("EMAIL")
    private String email;
    @Column("PASSWORD")
    private String password;
    @Column("USER_NAME")
    private String userName;
    @Column("REG_DT")
    private LocalDateTime regDt;
}
