public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
//        Book book = new Book();
//        book.author = author;
//        book.title = title;
        return new Book(author, title);
    }

    public static void main(String[] args) {
        Book book = Book.of("Adam M.", "Pan Tadzio");
        System.out.println(book.getClass() + " Author: " + book.author + " Title: " + book.author);
    }
}
