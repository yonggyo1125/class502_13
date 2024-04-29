package exam02;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        Jucier.make(grapeBox);
    }
}
