package exam02;

import java.util.ArrayList;

public class Jucier {
    public static void make(FruitBox<Apple> box) {
        ArrayList<Apple> fruits =  box.getItems();
        System.out.println(fruits);
    }
}
