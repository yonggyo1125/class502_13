package exam04;

public class LoginService {
    public void login(String userId, String userPw) {
       // userId - user01, userPw = 123456
       try {
           if (!userId.equals("user01")) {
               throw new UserIdException("아이디가 일치하지 않습니다.");
           }

           if (!userPw.equals("123456")) {
               throw new UserPwException("비밀번호가 일치하지 않습니다.");
           }

           System.out.println("로그인 성공!");
       } catch (UserIdException | UserPwException e) {
           System.out.println(e.getMessage());
       }
    }
}
