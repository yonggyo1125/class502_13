package org.choongang.config;

import lombok.RequiredArgsConstructor;
import org.choongang.global.interceptors.MemberOnlyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {

    private final MemberOnlyInterceptor memberOnlyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(memberOnlyInterceptor)
                .addPathPatterns("/mypage/**");


    }
}
