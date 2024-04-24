package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        System.out.printf("s1 == s2: %s%n", s1 == s2);
        System.out.printf("s1 주소: %d%n", System.identityHashCode(s1));
        System.out.printf("s2 주소: %d%n", System.identityHashCode(s2));
    }
}
