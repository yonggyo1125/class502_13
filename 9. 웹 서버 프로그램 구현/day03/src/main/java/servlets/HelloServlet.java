package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("안녕하세요~!");
        System.out.println("doGet()");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }
}
