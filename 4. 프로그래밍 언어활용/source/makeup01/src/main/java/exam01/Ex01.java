package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem(new Apple());

        Apple item = (Apple)box.getItem(); // 형변환 번거로움
        String title = item.get();
        System.out.println(title);




        Box box2 = new Box();
        box2.setItem(new Grape());
       // if (box2.getItem() instanceof  Apple) {
            Apple apple = (Apple) box2.getItem();  // 타입 안정성이 떨어진다.
        //}

    }
}
