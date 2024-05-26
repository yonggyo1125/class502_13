package org.choongang.main.controllers;

import org.choongang.global.AbstractController;
import org.choongang.templates.Templates;

public class MainController extends AbstractController {
    @Override
    public void show() {
        Templates.getInstance().show("main_menu");

    }
}
