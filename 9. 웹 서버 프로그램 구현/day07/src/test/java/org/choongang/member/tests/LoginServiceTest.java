package org.choongang.member.tests;

import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {

    private LoginService loginService;

    @BeforeEach
    void init() {
        loginService = MemberServiceProvider.getInstance().loginService();
    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest() {
        assertDoesNotThrow(() -> {
            LoginService loginService = new LoginService();
            loginService.process();
        });
    }
}
