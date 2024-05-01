package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        Collections.swap(names, 1, 3);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        Collections.replaceAll(names, "이름3", "name3");
        System.out.println(names);
    }
}
