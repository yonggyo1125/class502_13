package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new SimpeCalculator();

        int result = cal.add(10, 20);
        System.out.println(result);

        //cal.num1 = 20;

        System.out.println(cal.num1);
        cal.commonMethod();
    }
}
