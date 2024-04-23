package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book(1000, "책1", "저자1");
        System.out.println(book); // book.toString()
        Class cls = Book.class;
        Class cls2 = book.getClass();
    }
}
