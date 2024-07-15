package org.choongang.member.validators;


import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator {

    private final MemberMapper mapper;

    @Override
    public boolean supports(Class<?> clazz) { // RequestJoin 커맨드 객체만 검증하도록 제한
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /**
         * 1. 필수 항목 검증 (email, password, confirmPassword, userName, agree)
         * 2. 이메일 중복 여부(회원이 가입되어 있는지 체크)
         * 3. 비밀번호 자리수 체크(8자리)
         * 4. 비밀번호, 비밀번호 확인 일치 여부
         */

        RequestJoin form = (RequestJoin) target;
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean agree = form.isAgree();

        // 필수 항목 검증
        /*
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required", "이메일을 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required", "비밀번호를 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "Required", "비밀번호를 확인하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "Required", "회원명을 입력하세요.");

        if (!agree) {
            errors.rejectValue("agree", "Required", "회원 가입 약관에 동의하세요.");
        }
        */

        // 2. 이메일 중복 여부(회원이 가입되어 있는지 체크)
        if (StringUtils.hasText(email) && mapper.exists(email) != 0L) {
            errors.rejectValue("email", "Duplicated");
        }

        // 3. 비밀번호 자리수 체크(8자리)
        /*
        if (StringUtils.hasText(password) && password.length() < 8) {
            errors.rejectValue("password", "Length");
        }
        */

        // 4. 비밀번호, 비밀번호 확인 일치 여부
        if (StringUtils.hasText(password) && StringUtils.hasText(confirmPassword) && !password.equals(confirmPassword)) {
            errors.rejectValue("confirmPassword", "Mismatch");
        }
    }

    /*
    @Override
    public void check(RequestJoin form) {
        /**
         * 1. 필수 항목 검증 (email, password, confirmPassword, userName, agree)
         * 2. 이메일 중복 여부(회원이 가입되어 있는지 체크)
         * 3. 비밀번호 자리수 체크(8자리)
         * 4. 비밀번호, 비밀번호 확인 일치 여부
         */
        /*
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean result = form.isAgree();

        checkRequired(email, new BadRequestException("이메일을 입력하세요."));
        checkRequired(password, new BadRequestException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword, new BadRequestException("비밀번호를 확인하세요."));
        checkRequired(userName, new BadRequestException("회원명을 입력하세요."));

        checkTrue(result, new BadRequestException("약관에 동의하세요."));

        // 이메일 중복 여부
        checkTrue(mapper.exists(email) == 0L, new BadRequestException("이미 가입된 이메일 입니다."));

        // 비밀번호 자리수 체크
        checkTrue(password.length() >= 8, new BadRequestException("비밀번호는 8자리 이상 입력하세요."));

        // 비밀번호, 비밀번호 확인 일치 여부
        checkTrue(password.equals(confirmPassword), new BadRequestException("비밀번호가 일치하지 않습니다."));
    }

         */
}
