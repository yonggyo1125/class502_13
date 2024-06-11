package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        //resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입</h1>");
        out.println("<form method='POST' action='join'>");
        out.println("이메일:<input type='text' name='email'><br>");
        out.println("비밀번호:<input type='password' name='password'><br>");
        out.println("비밀번호 확인:<input type='password' name='confirmPassword'><br>");
        out.println("회원명:<input type='text' name='userName'><br>");
        out.println("취미:<input type='checkbox' name='hobby' value='취미1'>취미1");
        out.println("<input type='checkbox' name='hobby' value='취미2'>취미2");
        out.println("<input type='checkbox' name='hobby' value='취미3'>취미3");
        out.println("<input type='checkbox' name='hobby' value='취미4'>취미4");
        out.println("<input type='checkbox' name='hobby' value='취미5'>취미5");
        out.println("<button type='submit'>가입하기</button>");
        out.println("</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8"); // 서블릿 4버전 까지, 기본 유니코드 2바이트 형식, 서블릿 6버전 부터는 기본 유니코드가 3바이트(UTF-8)

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String userName = req.getParameter("userName");
        String[] hobbies = req.getParameterValues("hobby");

        System.out.printf("email=%s, password=%s, confirmPassword=%s, userName=%s%n", email, password, confirmPassword, userName);

        Arrays.stream(hobbies)
                .forEach(s -> System.out.println("hobby:" + s));
    }
}
