package member.services;

import jakarta.servlet.http.HttpServletRequest;

public class LoginService {

    public void process(HttpServletRequest request) {
        // 아이디 : email, 비밀번호 password
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.printf("email=%s, password=%s%n", email, password);
    }
}
