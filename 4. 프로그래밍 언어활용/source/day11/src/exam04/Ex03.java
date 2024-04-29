package exam04;

import java.util.Vector;

public class Ex03 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>(3);
        System.out.println(names.capacity());
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        System.out.println(names.capacity());
        names.add("이름4");
        System.out.println(names.capacity());

    }
}
