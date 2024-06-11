package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

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
        out.println("<button type='submit'>가입하기</button>");
        out.println("</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String userName = req.getParameter("userName");
    }
}
