package servlets;

import jakarta.servlet.ServletConfig;
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
    /*
    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }
    */

    @Override
    public void init(ServletConfig config) throws ServletException {
        // HelloServlet만 조회 가능
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1=%s, key2=%s%n", key1, key2);

        // 모든 서블릿이 조회 가능
        String common1 = config.getInitParameter("common1");
        String common2 = config.getInitParameter("common2");
        System.out.printf("common1=%s, common2=%s%n", common1, common2);
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }
}
