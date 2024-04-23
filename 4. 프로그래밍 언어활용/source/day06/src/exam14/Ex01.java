package exam14;

public class Ex01 {
    public static void main(String[] args) {
        //Board b1 = new Board();
        //Board b2 = new Board();
        Board b1 = Board.getInstance();
        Board b2 = Board.getInstance();
        System.out.println(b1 == b2);
        System.out.println("b1 : " + System.identityHashCode(b1));
        System.out.println("b2 : " + System.identityHashCode(b2));
    }
}
