package exam03;

public class Juicier {
    public static void make(FruitBox<?> box) {
        System.out.println(box.get());
    }

    public static void make2(FruitBox<? extends Fruit> box) {
        System.out.println(box.get());
    }

    // Apple, Fruit, Object
    public static void make3(FruitBox<? super Apple> box) {
        System.out.println(box.get());
    }

    public static <T extends Fruit>  void make4(FruitBox<T> box) {
        System.out.println(box.get());
    }
}
