package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Transportation trans = Transportation.TAXI;
        String str = trans.name(); // trans.toString()
        System.out.println(str);

        int ordinal = trans.ordinal(); // 상수의 위치 번호
        System.out.println(ordinal);
    }
}
