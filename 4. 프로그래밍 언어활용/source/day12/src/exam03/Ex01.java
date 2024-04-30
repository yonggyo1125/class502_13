package exam03;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 15000);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        starBucks.enter(kim);
        starBucks.order();
        starBucks.exit();
    }
}
