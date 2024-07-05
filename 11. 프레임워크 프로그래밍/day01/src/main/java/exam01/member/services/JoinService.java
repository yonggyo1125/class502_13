package exam01.member.services;

import exam01.member.controllers.RequestJoin;
import exam01.member.validators.JoinValidator;

public class JoinService {

    private JoinValidator validator;

    // 의존 관계 - 없으면 객체 생성 X
    public JoinService(JoinValidator validator) {
        this.validator = validator;
    }

    /*
    // 연관 관계 - 없어도 객체는 생성 된다.
    public void setValidator(JoinValidator validator) {
        this.validator = validator;
    }
    */
    public void process(RequestJoin form) {
        validator.check(form);  // joinService는 validator 객체, form 객체를 의존 -> 의존성

        // 데이터 영구 저장 - DAO(Data Access Object)
    }
}
