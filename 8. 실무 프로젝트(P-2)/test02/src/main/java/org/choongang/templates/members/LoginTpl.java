package org.choongang.templates.members;

import org.choongang.templates.Template;

public class LoginTpl implements Template {
    @Override
    public String getTpl() {
        StringBuffer sb = new StringBuffer();
        sb.append("로그인\n");
        sb.append("아이디와 비밀번호를 입력하세요.\n");
        return sb.toString();
    }
}
