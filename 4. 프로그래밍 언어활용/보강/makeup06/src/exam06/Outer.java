package exam06;

public class Outer {

    int num1 = 100;
    static int num2 = 200;

    static class Inner {
        public void method() {
            //System.out.println(num1); //
            System.out.println(num2);
        }
    }
}
