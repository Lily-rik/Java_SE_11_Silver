package chapter6.other;

// 27.
public class Book {
    private String isbn;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    protected void printInfo() {
        System.out.println(isbn);
    }
}
