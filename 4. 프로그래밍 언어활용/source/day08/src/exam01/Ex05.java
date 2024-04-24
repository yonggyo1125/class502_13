package exam01;

import java.util.HashSet;

public class Ex05 {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("AAA");
        data.add("BBB");
        data.add("AAA");
        data.add("CCC");
        System.out.println(data);
    }
}
