package week2;

public class Book<T> {

    private String title;
    private String author;
    private T identifier;

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    public T getIdentifier() {
        return identifier;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
