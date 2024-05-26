package org.choongang.main;

import com.sun.tools.javac.Main;
import org.choongang.global.Controller;
import org.choongang.global.Router;
import org.choongang.global.constants.Menu;
import org.choongang.main.controllers.MainController;
import org.choongang.member.controllers.JoinController;
import org.choongang.member.controllers.LoginController;

public class MainRouter implements Router {

    private static Router instance;

    private MainRouter() {}

    public static Router getInstance() {
        if (instance == null) {
            instance = new MainRouter();
        }

        return instance;
    }

    @Override
    public void change(Menu menu) {
        Controller controller = null;
        switch (menu) {
            case JOIN: controller = new JoinController(); break;
            case LOGIN: controller = new LoginController(); break;
            default: // 메인페이지
                controller = new MainController();
        }

        controller.run();
    }
    
    // 애플리케이션 시작
    public void start() {
        while(true) {
            change(Menu.MAIN);
        }
    }
}
