package exam01;

import java.io.Serializable;

public class Book implements Serializable {
    private int isbn; // 도서 번호
    private String title; // 도서명
    private String author; // 저자

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
