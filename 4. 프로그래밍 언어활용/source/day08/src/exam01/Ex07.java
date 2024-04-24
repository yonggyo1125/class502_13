package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String str1 = new String("AAA");
        String str2 = new String("AAA");
        System.out.printf("str1.equals(str2): %s%n", str1.equals(str2));
        System.out.printf("str1.hashCode(): %d%n", str1.hashCode());
        System.out.printf("str2.hashCode(): %d%n", str2.hashCode());
    }
}
