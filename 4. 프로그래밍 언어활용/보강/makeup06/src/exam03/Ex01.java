package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();

        order.buy();
        order.sell();

        order.order();

        System.out.println(Seller.num);
    }
}
