package exam06;

public class Book  {
    private int isbn; // 도서 번호
    private String title; // 책 제목
    private String author;  // 저자

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("isbn=%d, title=%s, author=%s%n", isbn, title, author);
    }
}
