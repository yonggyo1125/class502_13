package exam01;

public class Box<T> { // Box<T> : 지네릭 클래스, T - 타입 매개변수, Box : 원시타입
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
