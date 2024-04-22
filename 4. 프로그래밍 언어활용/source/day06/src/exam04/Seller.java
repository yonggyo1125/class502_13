package exam04;

public interface Seller {
    void sell();
    default void order() {
        System.out.println("Seller에서 주문");
    }
}