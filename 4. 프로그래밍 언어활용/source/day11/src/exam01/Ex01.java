package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.setItem(new Apple());
       // appleBox.setItem(new Grape()); 타입 안정성 확보

        Apple apple = appleBox.getItem(); // 형변환 X
        System.out.println(appleBox);// appleBox.toString();
    }
}
