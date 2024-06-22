package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Human(); // Animal animals[0] = new Human();
        animals[1] = new Tiger(); // Animal animals[1] = new Tiger();
        animals[2] = new Bird(); // Animal animals[2] = new Bird();

        for (Animal animal: animals) {
            animal.move();
        }
    }
}
