package exam06;

public class Ex05 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = new String("ABC");

        boolean result = isSame(str1, str2);
        System.out.printf("result : %s%n", result);
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
    }

    public static boolean isSame(String str1, String str2) {
        return str1.equals(str2);
    }
}
