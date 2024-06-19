package org.choongang.member.validators;

import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;

public class JoinValidator implements Validator<RequestJoin> {

    @Override
    public void check(RequestJoin form) {
        /* 필수 항목 검증 - 이메일, 비밀번호, 비밀번호 확인, 회원명, 약관 동의 */

    }
}
