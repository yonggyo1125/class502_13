package exam02;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Jucier.make(appleBox);
    }
}
