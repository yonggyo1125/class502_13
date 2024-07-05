package exam01.member.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {
    private long seq;
    private String email;
    private String password;
    private String userName;
    private String regDt;
}
