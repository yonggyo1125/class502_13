package exam01;

import com.github.javafaker.Faker;
import global.Mailer;
import member.services.LoginService;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.mockito.Mockito.mock;

public class Ex02Test {

    private LoginService loginService;
    private Mailer mailer;
    private Faker faker;

    @BeforeEach
    void init() {
        loginService = new LoginService(new LoginValidator());
        mailer = mock(Mailer.class);
        faker = new Faker(Locale.ENGLISH);
    }

    @Test
    void test1() {

    }
}
