package org.choongang.member.tests;

import com.github.javafaker.Faker;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.MemberServiceProvider;
import org.choongang.member.validators.JoinValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {

    private JoinService service;

    @BeforeEach
    void init() {
        service = MemberServiceProvider.getInstance().joinService();
    }

    RequestJoin getData() {
        Faker faker = new Faker(Locale.ENGLISH);

        RequestJoin form =  RequestJoin.builder()
                    .email(System.currentTimeMillis() + faker.internet().emailAddress())
                    .password(faker.regexify("\\w{8}").toLowerCase())
                    .userName(faker.name().fullName())
                    .termsAgree(true)
                    .build();
        form.setConfirmPassword(form.getPassword());

        return form;
    }

    @Test
    @DisplayName("회원가입 성공시 예외가 발생하지 않음")
    void successTest() {
        assertDoesNotThrow(() -> {
            service.process(getData());
        });
    }

    @Test
    @DisplayName("필수 입력항목(이메일, 비밀번호, 비밀번호 확인, 회원명, 약관 동의) 검증, 검증 실패시 BadRequestException 발생")
    void requiredFieldTest() {
        assertThrows(BadRequestException.class, () -> {
           RequestJoin form = getData();
           form.setEmail(null);
           service.process(form);
        });
    }

    void requiredEachFieldTest(String field, boolean isNull, String keyword) {
        BadRequestException thrown = assertThrows(BadRequestException.class, () -> {
            RequestJoin form = getData();
            if (field.equals("email")) {
                form.setEmail(isNull?null:"    ");
            } else if (field.equals("password")) {
                form.setPassword(isNull?null:"    ");
            } else if (field.equals("confirmPassword")) {
                form.setConfirmPassword(isNull?null:"    ");
            } else if (field.equals("userName")) {
                form.setUserName(isNull?null:"     ");
            } else if (field.equals("termsAgree")) {
                form.setTermsAgree(false);
            }

            service.process(form);

        }, field + " 테스트");
    }
}
