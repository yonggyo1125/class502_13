package exam03;

public class Card {
    private static int num;
    private int cardNum;
    private String holder;

    public Card(String holder) {
        this.holder = holder;
        cardNum = ++num;
    }

    public String toString() {
        return String.format("카드번호: %d, 카드 소유자: %s%n", cardNum, holder);
    }
}
