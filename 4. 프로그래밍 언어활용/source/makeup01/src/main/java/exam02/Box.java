package exam02;

public class Box<T extends Fruit> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void print() {
       // System.out.println(item.get()); // T -> Object
        System.out.println(item.get());
    }
}
