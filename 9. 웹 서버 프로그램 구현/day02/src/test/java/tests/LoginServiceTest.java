package tests;

import jakarta.servlet.http.HttpServletRequest;
import member.services.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@DisplayName("로그인 서비스 기능 테스트")
public class LoginServiceTest {

    private LoginService loginService;
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        loginService = new LoginService();

        // HttpServletRequest 모의 객체 생성
        request = mock(HttpServletRequest.class);
    }

    @Test
    @DisplayName("로그인 성공시 예외 발생 없음")
    void successTest() {
        assertDoesNotThrow(() -> {
           loginService.process(request);
        });
    }
    
    @Test
    @DisplayName("필수 항목(아이디, 비밀번호) 검증, 검증 실패시 ValidationException 발생")
    void requiredFieldTest() {
        
    }
}
