package exam02;

import java.util.ArrayList;

public class FruitBox<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T fruit) {
        items.add(fruit);
    }

    public ArrayList<T> getItems() {
        return items;
    }

}
