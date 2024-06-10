package tests;

import com.github.javafaker.Faker;
import global.exceptions.ValidationException;
import jakarta.servlet.http.HttpServletRequest;
import member.services.LoginService;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@DisplayName("로그인 서비스 기능 테스트")
public class LoginServiceTest {

    private LoginService loginService;
    private HttpServletRequest request;
    private Faker faker;

    @BeforeEach
    void init() {
        loginService = new LoginService(new LoginValidator());

        // HttpServletRequest 모의 객체 생성
        request = mock(HttpServletRequest.class);
        faker = new Faker(Locale.KOREAN);
    }

    void setParamData(String name, String value) {
        given(request.getParameter(name)).willReturn(value);
    }

    void setSuccessData() {
        String password = faker.regexify("\\w{8}").toLowerCase();
        setParamData("email", faker.internet().emailAddress());
        setParamData("password", password);
    }

    @Test
    @DisplayName("로그인 성공시 예외 발생 없음")
    void successTest() {
        assertDoesNotThrow(() -> {
            setSuccessData();
           loginService.process(request);
        });
    }
    
    @Test
    @DisplayName("필수 항목(아이디, 비밀번호) 검증, 검증 실패시 ValidationException 발생")
    void requiredFieldTest() {
        assertAll(
                // 이메일 검증
                () -> requiredFieldEachTest("email", "이메일"),
                // 비밀번호 검증
                () -> {
                    setParamData("email", faker.internet().emailAddress());
                    requiredFieldEachTest("password", "비밀번호");
                }
        );
    }

    void requiredFieldEachTest(String name, String message) {

        ValidationException thrown = assertThrows(ValidationException.class, () -> {
             // null
             loginService.process(request);

             // 빈값
             setParamData(name, "     ");
             loginService.process(request);
        }, message + " 테스트");

        String msg = thrown.getMessage();
        assertTrue(msg.contains(message), message + " 테스트");
    }
    
    @Test
    @DisplayName("이메일로 회원이 조회되는지 검증, 검증 실패시 ValidationException 발생")
    void memberExistsTest() {
        
    }

    @Test
    @DisplayName("비밀번호가 일치하는지 검증, 검증 실패시 PasswordMismatchException 발생")
    void memberAuthTest() {

    }


}
