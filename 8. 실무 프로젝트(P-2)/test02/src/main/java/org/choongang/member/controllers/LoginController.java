package org.choongang.member.controllers;

import org.choongang.global.AbstractController;
import org.choongang.templates.Templates;

import java.util.function.Predicate;

public class LoginController extends AbstractController {
    @Override
    public void show() {
        Templates.getInstance().show("login");
    }

    @Override
    public void prompt() {
        String userId = promptWithValidate("아이디:", str -> !str.isBlank());

        String userPw = promptWithValidate("비밀번호:", str-> !str.isBlank());

        RequestLogin form = RequestLogin.builder()
                .userId(userId)
                .userPw(userPw)
                .build();

        // 로그인 처리
        System.out.println(form);

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
