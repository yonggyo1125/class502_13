package member;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Member {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;
}
