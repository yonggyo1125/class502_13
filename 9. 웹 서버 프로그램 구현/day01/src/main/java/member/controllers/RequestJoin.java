package member.controllers;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword; // 비번 확인
    private String userName;
    private boolean termsAgree; // 약관 동의
}
