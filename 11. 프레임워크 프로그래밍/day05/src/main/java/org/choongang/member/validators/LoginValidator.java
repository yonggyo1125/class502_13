package org.choongang.member.validators;

import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {

    private final MemberMapper mapper;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /**
         * 2) email로 회원이 조회 되는지 검증
         * 3) 조회된 회원의 비밀번호가 입력한 값과 일치하는지 검증
         */
        RequestLogin form = (RequestLogin)target;
        String email = form.getEmail();
        if (StringUtils.hasText(email)) {
            Member member = mapper.get(email);
            if (member == null) {
                errors.rejectValue("email", "Fail.login");
            }


        }
    }
}
