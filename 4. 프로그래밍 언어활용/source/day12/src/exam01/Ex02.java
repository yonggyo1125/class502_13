package exam01;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));

        ListIterator<Book> iter = books.listIterator();
        System.out.println("--- 순방향 ----");
        while(iter.hasNext()) {
            Book book = iter.next();
            int index = iter.nextIndex();
            System.out.println(book);
            System.out.println("index : " + index);
        }

        System.out.println("--- 역방향 ----");
        while(iter.hasPrevious()) {
            Book book = iter.previous();
            int index = iter.previousIndex();
            System.out.println(book);
            System.out.println("index : " + index);
        }
    }
}
