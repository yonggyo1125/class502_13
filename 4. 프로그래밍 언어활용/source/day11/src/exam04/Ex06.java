package exam04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));

        Iterator<Book> iter = books.iterator();
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }

        iter = books.iterator();
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }
    }
}
