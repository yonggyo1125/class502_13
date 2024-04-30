package exam01;

public class Book {
    private int isbn; // 도서 번호
    private String title; // 도서명
    private String author; // 저자

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book)obj;
            if (isbn == book.isbn && title.equals(book.title)
                    && author.equals(book.author)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
