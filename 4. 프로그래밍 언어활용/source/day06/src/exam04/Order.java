package exam04;

public class Order implements Seller, Buyer {
    @Override
    public void buy() {
        System.out.println("구매!");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

    public void order() {
        //Seller.super.order();
        System.out.println("Order에서 정의한 order");
    }
}
