package org.choongang.global;

import org.choongang.global.constants.Menu;
import org.choongang.main.MainRouter;

import java.util.Scanner;

public abstract class AbstractController implements Controller {
    protected Scanner sc;

    public AbstractController() {
        sc = new Scanner(System.in);
    }

    public void common() { // 공통 출력 부분

    }


    public void prompt() { // 공통 입력 부분

        try {
            System.out.print("메뉴 입력: ");
            String menu = sc.nextLine();
            if (menu.equals("q")) {
                System.out.println("애플리케이션을 종료 합니다.");
                System.exit(0);
            }

            int m = Integer.parseInt(menu);
            change(m); // 메뉴 변경

        } catch (Exception e) {
            System.out.println("잘못된 메뉴를 선택하였습니다.");
        }
    }
    
    public final void run() {
        common();
        show();
        prompt();
    }

    public void change(int num) {
        Menu menu = null;
        switch (num) {
            case 1: menu = Menu.JOIN; break;
            case 2: menu = Menu.LOGIN; break;
            default: menu = Menu.MAIN;
        }

        MainRouter.getInstance().change(menu);
    }
}
