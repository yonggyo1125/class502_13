package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human(); // Human, Animal
        human.move();

        Tiger tiger = new Tiger(); // Tiger, Animal
        tiger.move();

        Bird bird = new Bird(); // Bird, Animal
        bird.move();

        Animal[] animals = new Animal[3];
        animals[0] = human;
        animals[1] = tiger;

    }
}
