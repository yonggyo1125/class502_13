package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        //HashSet<String> names = new HashSet<>();

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2); // 오름 차순
                //return o2.compareTo(o1); // 내림 차순
                return o1.compareTo(o2) * -1; // 내림차순
            }
        };

        //Set<String> names = new TreeSet<>(comp);
        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("이름2");
        names.add("이름2");
        names.add("이름1");
        names.add("이름3");
        names.add("이름5");
        names.add("이름4");

        System.out.println(names); // names.toString()
    }
}
