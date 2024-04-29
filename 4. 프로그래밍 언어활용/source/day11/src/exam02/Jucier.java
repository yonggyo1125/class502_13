package exam02;

import java.util.ArrayList;

public class Jucier {
    // ? - Fruit, Apple, Grape
    public static void make(FruitBox<? extends Fruit> box) {
        ArrayList<?> fruits =  box.getItems();
        System.out.println(fruits);
    }

    // ? - Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> box) {
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }
}
