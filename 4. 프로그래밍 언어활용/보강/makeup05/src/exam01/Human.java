package exam01;

public class Human extends Animal {

    @Override
    public void move() {
        System.out.println("두발로 직립보행");
    }

    public void hobby() {
        System.out.println("공부한다.");
    }
}
