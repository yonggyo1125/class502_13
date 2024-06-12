package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class BoardFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter()!");

        chain.doFilter(request, response); // 다음 필터 또는 서블릿의 처리 메서드 실행
    }
}
