package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex07 {
    public static void main(String[] args) {
        String[] names = {"이름1", "이름1", "이름2", "이름3", "이름4", "이름5"};


        ArrayList<String> items = Arrays.stream(names)
                .collect(Collectors.toCollection(ArrayList::new));
                //.collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(items);
    }
}
