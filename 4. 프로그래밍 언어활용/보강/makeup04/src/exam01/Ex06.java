package exam01;

public class Ex06 {
    public static void main(String[] args) {
        String str = new String("이름");

        String str1 = "이름";
        String str2 = "이름";

        System.out.println("str : " + System.identityHashCode(str));
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
    }
}
