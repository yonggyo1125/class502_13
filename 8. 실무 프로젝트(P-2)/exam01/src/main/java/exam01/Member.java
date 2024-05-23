package exam01;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String mobile;
    private LocalDateTime regDt;
}
