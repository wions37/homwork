package week2;

public class Book<T> {
// Book 클래스 제네릭 타입 T
    // 책의 제목, 책의 저자, 책의 고유 식별자 선언

    private String title;
    private String author;
    private T identifier;

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }
//책의 제목
    public T getIdentifier() {
        return identifier;
    }
//책의 저자
    public String getAuthor() {
        return author;
    }
//책의 고유 식별자
    public String getTitle() {
        return title;
    }
}
