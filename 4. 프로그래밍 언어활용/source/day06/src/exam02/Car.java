package exam02;

public abstract class Car {
    public abstract void start();
    public abstract void press();
    public abstract void turnoff();

    public final void run() { // 템플릿 메서드 패턴
        start();
        press();
        turnoff();
    }
}
