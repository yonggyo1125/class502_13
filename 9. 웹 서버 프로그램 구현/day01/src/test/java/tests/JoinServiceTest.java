package tests;

import global.exceptions.ValidationException;
import member.controllers.RequestJoin;
import member.services.JoinService;
import member.validators.JoinValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능 테스트")
public class JoinServiceTest {

    private JoinService joinService;

    @BeforeEach
    void init() {
        joinService = new JoinService(new JoinValidator());
    }

    RequestJoin getData() {
        return RequestJoin.builder()
                .email("test" + System.currentTimeMillis() + "@test.org")
                .password("12345678")
                .confirmPassword("12345678")
                .userName("사용자")
                .termsAgree(true)
                .build();
    }

    @Test
    @DisplayName("회원가입 성공시 예외가 발생 없음")
   void successTest() {
        assertDoesNotThrow(() -> {
            joinService.process(getData());
        });
   }
   
   @Test
   @DisplayName("필수항목(이메일, 비밀번호, 비밀번호 확인, 회원명) 검증, 검증 실패시 ValidationException 발생")
   void requiredFieldTest() {
       assertAll(
               // 이메일 검증
               () -> {
                  RequestJoin form = getData();
                  form.setEmail(null);
                  requiredFieldEachTest(form, "이메일");

                  form.setEmail("     ");
                  requiredFieldEachTest(form, "이메일");
               },
               // 비밀번호 검증
               () -> {
                   RequestJoin form = getData();
                   form.setPassword(null);
                   requiredFieldEachTest(form, "비밀번호");

                   form.setPassword("     ");
                   requiredFieldEachTest(form, "비밀번호");
               },
               // 비밀번호 확인 검증
               () -> {
                   RequestJoin form = getData();
                   form.setConfirmPassword(null);
                   requiredFieldEachTest(form, "비밀번호를 확인");
                   
                   form.setConfirmPassword("     ");
                   requiredFieldEachTest(form, "비밀번호를 확인");
               },
               // 회원명 검증
               () -> {
                    RequestJoin form = getData();
                    form.setUserName(null);
                    requiredFieldEachTest(form, "회원명");

                    form.setUserName("    ");
                    requiredFieldEachTest(form, "회원명");
               }
       );
   }

   void requiredFieldEachTest(RequestJoin form, String keyword) {
       ValidationException thrown = assertThrows(ValidationException.class, () -> {
            joinService.process(form);
        });

       String message = thrown.getMessage();
       assertTrue(message.contains(keyword));
   }
}
