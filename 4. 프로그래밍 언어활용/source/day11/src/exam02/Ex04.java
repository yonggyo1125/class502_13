package exam02;

public class Ex04 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());

        Jucier.make2(appleBox);
    }
}
