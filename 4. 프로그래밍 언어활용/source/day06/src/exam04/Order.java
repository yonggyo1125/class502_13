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
}
