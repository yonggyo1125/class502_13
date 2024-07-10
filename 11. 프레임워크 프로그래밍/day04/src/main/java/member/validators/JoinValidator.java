package member.validators;

import global.validators.Validator;
import member.controllers.RequestJoin;
import org.springframework.stereotype.Component;

@Component
public class JoinValidator implements Validator<RequestJoin> {

    @Override
    public void check(RequestJoin form) {

    }
}
