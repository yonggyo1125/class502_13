package exam02;

public class Ex04 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());

        Jucier.make2(appleBox); // Apple, Fruit, Object

        //FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape()); // Fruit fruit = new Grape();
        Jucier.<Grape>make3(grapeBox);
        Jucier.make3(grapeBox);
    }
}
