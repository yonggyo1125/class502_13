package org.choongang.templates;

import org.choongang.templates.commons.Common;
import org.choongang.templates.mains.MainTpl;
import org.choongang.templates.members.JoinTpl;
import org.choongang.templates.members.LoginTpl;

public class Templates {

    private static Templates instance;

    private Templates() {}

    public Common common() {
        return new Common();
    }

    public MainTpl mainTpl() {
        return new MainTpl();
    }

    public JoinTpl joinTpl() {
        return new JoinTpl();
    }

    public LoginTpl loginTpl() {
        return new LoginTpl();
    }

    public static Templates getInstance() {
        if (instance == null) {
            instance = new Templates();
        }

        return instance;
    }

    public String get(String tpl) {
        Template template = null;
        if (tpl.equals("main_menu")) {
            template = mainTpl();
        } else if (tpl.equals("join")) {
            template = joinTpl();
        } else if (tpl.equals("login")) {
            template = loginTpl();
        }

        return template.getTpl();
    }


    public void show(String tpl) {
        System.out.println(get(tpl));
    }
}
