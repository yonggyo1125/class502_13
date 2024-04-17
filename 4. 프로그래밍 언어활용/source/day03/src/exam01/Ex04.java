package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2024, 4, 17);
        int year = s1.year();
        int month = s1.month();
        int day = s1.day();
        System.out.printf("%d-%d-%d%n", year, month, day);

        System.out.println(s1); // s1.toString();
    }
}
