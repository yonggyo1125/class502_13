package member.validators;

import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;

public class LoginValidator implements Validator<HttpServletRequest> {

    @Override
    public void check(HttpServletRequest form) {
        String email = form.getParameter("email");
        if (email == null || email.isBlank()) {
            throw new ValidationException("이메일을 입력하세요.");
        }

    }
}
