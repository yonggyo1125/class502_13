package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

import java.io.IOException;
/*
@WebFilter(value="/board",
        initParams = {
                @WebInitParam(name="k1", value="value1"),
                @WebInitParam(name="k2", value="value2")
}) */
public class BoardFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String k1 = filterConfig.getInitParameter("k1");
        String k2 = filterConfig.getInitParameter("k2");
        System.out.printf("k1=%s, k2=%s%n", k1, k2);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("BoardFilter - 요청 전");

        chain.doFilter(request, response); // 다음 필터 또는 서블릿의 처리 메서드 실행

        System.out.println("BoardFilter - 응답 후");
    }
}
