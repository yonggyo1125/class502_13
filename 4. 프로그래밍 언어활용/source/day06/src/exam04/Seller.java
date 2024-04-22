package exam04;

public interface Seller {
    void sell();
    default void order() {
        System.out.println("Seller에서 주문");
    }
    
    public static void staticMethod() {
        System.out.println("정적 메서드, 인터페이스 이든, 클래스이든 원래부터 사용 가능");
    }
}