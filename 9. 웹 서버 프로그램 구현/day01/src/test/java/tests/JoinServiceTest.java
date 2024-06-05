package tests;

import global.exceptions.ValidationException;
import member.controllers.RequestJoin;
import member.services.JoinService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능 테스트")
public class JoinServiceTest {

    @Test
    @DisplayName("회원가입 성공시 예외가 발생 없음")
   void successTest() {
        assertDoesNotThrow(() -> {
            JoinService service = new JoinService();
            RequestJoin form = RequestJoin.builder().build();
            service.process(form);
        });
   }
   
   @Test
   @DisplayName("필수항목(이메일, 비밀번호, 비밀번호 확인, 회원명) 검증, 검증 실패시 ValidationException 발생")
   void requiredFieldTest() {
        /* 이메일 필수 검증 S */
        assertThrows(ValidationException.class, () -> {
            RequestJoin form = RequestJoin.builder().build();
            JoinService service = new JoinService();
            service.process(form);
        });
       /* 이메일 필수 검증 E */
        
   }
}
