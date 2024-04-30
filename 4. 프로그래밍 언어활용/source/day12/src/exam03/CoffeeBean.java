package exam03;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean extends AbstractCoffeeShop {

    private static Map<String, Integer> menus;

    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 3800);
        menus.put("라떼", 4300);
    }

    public CoffeeBean() {
        super("커피빈", menus);
    }
}
