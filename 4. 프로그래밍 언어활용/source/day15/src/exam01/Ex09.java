package exam01;

import java.util.Optional;

public class Ex09 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);

        //Book book2 = opt.orElseGet(() -> new Book());
        Book book2 = opt.orElseGet(Book::new);
        System.out.println(book2);
    }
}
