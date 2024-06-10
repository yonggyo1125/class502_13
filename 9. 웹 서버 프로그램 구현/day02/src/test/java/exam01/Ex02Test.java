package exam01;

import com.github.javafaker.Faker;
import global.Mailer;
import jakarta.servlet.http.HttpServletRequest;
import member.services.LoginService;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class Ex02Test {

    private LoginService loginService;
    private Mailer mailer;
    private Faker faker;
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        loginService = new LoginService(new LoginValidator());
        mailer = mock(Mailer.class);
        faker = new Faker(Locale.ENGLISH);

        request = mock(HttpServletRequest.class);

        // 스텁(Stub) 추가
        given(request.getParameter("email")).willReturn(faker.internet().emailAddress());
        given(request.getParameter("password")).willReturn(faker.regexify("\\w{8}").toLowerCase());
    }

    @Test
    void test1() {
        loginService.process(request);
    }
}
