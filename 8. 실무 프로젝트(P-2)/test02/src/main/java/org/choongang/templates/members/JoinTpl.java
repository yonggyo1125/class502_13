package org.choongang.templates.members;

import org.choongang.templates.Template;

public class JoinTpl implements Template {
    @Override
    public String getTpl() {
        StringBuffer sb = new StringBuffer();
        sb.append("회원가입\n");
        sb.append("하기 항목을 입력하세요.\n");
        return sb.toString();
    }
}
