package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String trans = "BUS";
        Transportation BUS = Enum.valueOf(Transportation.class, trans);

        Transportation TAXI = Transportation.valueOf("TAXI");

        Transportation[] trans2 = Transportation.values();
        System.out.println(Arrays.toString(trans2));
    }
}
