package exam03;

public interface Seller {
    int num = 10; // public static final
    void sell();
    default void order() {
        System.out.println("Seller - 주문");
        privateMethod();
    };
    
    static void staticMethod() {
        System.out.println("정적 메서드");
    }

    private void privateMethod() {

    }
}
