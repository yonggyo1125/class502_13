package member;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private long USER_NO;
    private String USER_ID;
    private String USER_PW;
    private String USER_NM;
    private String MOBILE;
    private LocalDateTime REG_DT;
    private LocalDateTime MOD_DT;
}
