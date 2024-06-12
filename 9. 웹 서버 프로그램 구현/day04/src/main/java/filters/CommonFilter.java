package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class CommonFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("CommonFilter - 요청 전");

        chain.doFilter(request, response);

        System.out.println("CommonFilter - 응답 후");
    }
}
