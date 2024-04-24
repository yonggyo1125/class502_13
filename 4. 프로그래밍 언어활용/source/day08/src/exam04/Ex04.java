package exam04;

import java.util.Objects;

public class Ex04 {
    public static void main(String[] args) {
        String str = null;

        str = Objects.requireNonNullElse(str, "");

        str.toUpperCase(); // NullPointerException 발생 , NPE
    }
}
