package exam03;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Juicier.make(appleBox);

        FruitBox<Object> grapeBox = new FruitBox<>();
        grapeBox.add(new Object());
        grapeBox.add(new Object());
        //Juicier.make2(grapeBox); // Fruit, Apple, Grape

        FruitBox<Fruit> appleBox2 = new FruitBox<>();
        appleBox2.add(new Grape());
        appleBox2.add(new Grape());

        Juicier.make3(appleBox2); // Apple, Fruit, Object


        FruitBox<Grape> appleBox3 = new FruitBox<>();
        appleBox3.add(new Grape());
        appleBox3.add(new Grape());

        Juicier.<Grape>make4(appleBox3);
        Juicier.make4(appleBox3);
    }
}
