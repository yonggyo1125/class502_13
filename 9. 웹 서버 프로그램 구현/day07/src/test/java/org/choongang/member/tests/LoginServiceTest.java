package org.choongang.member.tests;

import com.github.javafaker.Faker;
import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@DisplayName("로그인 기능 테스트")
public class LoginServiceTest {

    private LoginService loginService;
    private Faker faker;

    @Mock
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        loginService = MemberServiceProvider.getInstance().loginService();

        faker = new Faker(Locale.ENGLISH);
        setData();
    }

    void setData() {
        setParam("email", faker.internet().emailAddress());
        setParam("password", faker.regexify("\\w{8}").toLowerCase());
    }

    void setParam(String name, String value) {
        given(request.getParameter(name)).willReturn(value);
    }

    @Test
    @DisplayName("로그인 성공시 예외가 발생하지 않음")
    void successTest() {
        assertDoesNotThrow(() -> {
            loginService.process(request);
        });
    }

    @Test
    @DisplayName("필수 입력 항목(이메일, 비밀번호) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFieldTest() {
        assertAll(
                () -> requiredEachFieldTest("email", false, "이메일"),
                () -> requiredEachFieldTest("email", true, "이메일"),
                () -> requiredEachFieldTest("password", false, "비밀번호"),
                () -> requiredEachFieldTest("password", true, "비밀번호")
        );
    }

    void requiredEachFieldTest(String name, boolean isNull, String message) {
        setData();
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
                if (name.equals("password")) {
                    setParam("password", isNull?null:"   ");
                } else { // 이메일
                    setParam("email", isNull?null:"   ");
                }

                loginService.process(request);
        }, name + " 테스트");

        String msg = thrown.getMessage();
        assertTrue(msg.contains(message), name + ", 키워드:" + message + "테스트");
    }
}
