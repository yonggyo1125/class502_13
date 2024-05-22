package member;

import java.time.LocalDateTime;

public class User {

    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;

    private User() {}

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userNm='" + userNm + '\'' +
                ", email='" + email + '\'' +
                ", regDt=" + regDt +
                '}';
    }

    public static class Builder {
        private User user = new User();

        public Builder userId(String userId) {
            user.userId = userId;

            return this;
        }

        public Builder userNm(String userNm) {
            user.userNm = userNm;

            return this;
        }

        public Builder email(String email) {
            user.email = email;

            return this;
        }

        public Builder regDt(LocalDateTime regDt) {
            user.regDt = regDt;

            return this;
        }

        public User build() {
            return user;
        }
    }
}
