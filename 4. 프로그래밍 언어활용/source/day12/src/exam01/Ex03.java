package exam01;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1001, "책2", "저자2"));
        books.add(new Book(1002, "책3", "저자3"));
        books.add(new Book(1003, "책4", "저자4"));
        books.add(new Book(1004, "책5", "저자5"));

        for (Book book : books) { // 향상된 for문
            System.out.println(book);
        }

        books.forEach(System.out::println);

    }
}
