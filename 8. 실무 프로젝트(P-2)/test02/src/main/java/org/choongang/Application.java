package org.choongang;

import com.sun.tools.javac.Main;
import org.choongang.global.Router;
import org.choongang.main.MainRouter;

public class Application {
    public static void main(String[] args) {
        Router router = MainRouter.getInstance();
        router.start();
    }
}
