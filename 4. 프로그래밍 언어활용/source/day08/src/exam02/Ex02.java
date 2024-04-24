package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "ABC"; // 힙영역 - 문자열 상수 풀, 문자열 상수
        String s2 = "ABC"; // 힙영역 - 문자열 상수 풀
        System.out.printf("s1 == s2: %s%n", s1 == s2);
        System.out.printf("s1 주소: %d%n", System.identityHashCode(s1));
        System.out.printf("s2 주소: %d%n", System.identityHashCode(s2));
    }
}
