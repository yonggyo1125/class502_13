package exam02;

public class Ex01 { // exam02.Ex01
    public static void main(String[] args) {
       Schedule s1 = new Schedule();
        s1.year = 2024;
        s1.month = 2;
        s1.day = 31; // 지양, 통제가 불가 하므로

        s1.showDate();
    }
}
