package org.choongang.member.services;

import org.choongang.global.Service;
import org.choongang.global.constants.Menu;
import org.choongang.main.MainRouter;
import org.choongang.member.controllers.RequestJoin;

public class JoinService implements Service<RequestJoin> {


    @Override
    public void process(RequestJoin form) {
        /* 회원 가입 처리 */
        System.out.println(form);

        // 회원가입 처리 후 로그인 화면 이동
        MainRouter.getInstance().change(Menu.LOGIN);
    }
}
