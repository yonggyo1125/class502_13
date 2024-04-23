package exam04;

public class LoginService {
    public void login(String userId, String userPw) {
       // userId - user01, userPw = 123456
        if (!userId.equals("user01")) {
            throw new UserIdException("아이디가 일치하지 않습니다.");
        }
    }
}
