package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class Board2Filter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("Board2Filter - 요청 전");

        chain.doFilter(request, response);

        System.out.println("Board2Filter - 응답 후");
    }
}
