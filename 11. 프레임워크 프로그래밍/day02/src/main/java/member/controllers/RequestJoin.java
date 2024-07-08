package member.controllers;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private LocalDateTime RegDt;
}
