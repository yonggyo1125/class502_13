package exam02;

public class Ex01 { // exam02.Ex01
    public static void main(String[] args) {
       Schedule s1 = new Schedule();
        /*
        s1.year = 2024;
        s1.month = 2;
        s1.day = 31; // 지양, 통제가 불가 하므로
        */

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        int month = s1.getMonth();
        System.out.println(month);

        s1.showDate();
    }
}
