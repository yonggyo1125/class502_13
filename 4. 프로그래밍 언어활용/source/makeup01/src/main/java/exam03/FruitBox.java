package exam03;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> {
    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public List<T> get() {
        return fruits;
    }
}
