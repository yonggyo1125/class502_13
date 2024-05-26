package org.choongang.templates.mains;

import org.choongang.templates.Template;

public class MainTpl implements Template {
    @Override
    public String getTpl() {
        StringBuffer sb = new StringBuffer(2000);
        sb.append("=======================================\n");
        sb.append("메뉴를 선택하세요.\n");
        /* 비회원 전용 메뉴 - 로그인시에는 미노출 S */
        sb.append("1. 회원가입\n");
        sb.append("2. 로그인\n");
        /* 비회원 전용 메뉴 - 로그인시에는 미노출 E */
        sb.append("q. 종료\n");
        sb.append("=======================================\n");
        return sb.toString();
    }
}
