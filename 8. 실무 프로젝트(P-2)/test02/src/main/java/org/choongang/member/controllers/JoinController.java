package org.choongang.member.controllers;

import org.choongang.global.AbstractController;
import org.choongang.global.Service;
import org.choongang.global.ServiceLocator;
import org.choongang.member.services.MemberServiceLocator;
import org.choongang.templates.Templates;

import java.util.function.Predicate;

public class JoinController extends AbstractController {
    @Override
    public void show() {
        Templates.getInstance().show("join");
    }

    @Override
    public void prompt() {
        /* 아이디 */
       String userId = promptWithValidate("아이디(6자리 이상 입력):", str -> str.length() >= 6);

        /* 비밀번호 */
        String userPw = promptWithValidate("비밀번호(8자리 이상 입력):",  str -> str.length() >= 8);

        /* 비밀번호 확인 */
        String confirmPw = promptWithValidate("비밀번호 확인:", str -> {
            boolean result = str.equals(userPw);
            if (!result) {
                System.err.println("\n비밀번호가 일치하지 않습니다.");
            }

            return result;
        });

        /* 회원명 */
        String userNm = promptWithValidate("회원명:", str -> !str.isBlank());

        RequestJoin form = RequestJoin.builder()
                .userId(userId)
                .userPw(userPw)
                .confirmPw(confirmPw)
                .userNm(userNm)
                .build();

        /* 회원 가입 처리 */
        Service joinService = MemberServiceLocator.getInstance().find("join");
        joinService.process(form);
    }

    public String promptWithValidate(String message, Predicate<String> predicate) {
        String str = null;
        do {
            System.out.print(message);
            str = sc.nextLine();
        } while(!predicate.test(str));

        return str;
    }
}
