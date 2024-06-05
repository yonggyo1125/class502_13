package member.services;

import global.validators.Validator;
import member.controllers.RequestJoin;

public class JoinService  {

    private Validator<RequestJoin> validator;

    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }

    public void process(RequestJoin form) {

        validator.check(form);

    }
}
