package exam02;

import java.time.LocalDateTime;

public class Member {
    private String userId;
    private String email;
    private LocalDateTime regDt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public void setRegDt(LocalDateTime regDt) {
        this.regDt = regDt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", regDt=" + regDt +
                '}';
    }
}
