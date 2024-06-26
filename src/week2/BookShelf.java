package week2;

//도서 추가, 삭제. 검색 메서드

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
    private List<Book<T>> books;

    // 기본 생성자
    public BookShelf() {
        this.books = new ArrayList<>();
    }

    // 도서 추가 메소드
    @Override
    public void addBook(Book<T> book) {
        books.add(book);
    }

    // 도서 삭제 메소드
    @Override
    public void removeBook(Book<T> book) {
        if (books.contains(book)) {
            books.remove(book);
        }
    }

    // 도서 제목으로 검색 메소드
    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> result = new ArrayList<>();
        String text = title.toUpperCase();
        //대문자로 만들어주는 메서드 , toLowerCase();
        for (Book<T> book : books) {
            if (book.getTitle().toUpperCase().contains(text)) {
                result.add(book);
            }
            //대문자로 만들어서, 대문자로 검색
        }
        return result;
    }
    // 도서 저자로 검색 메소드
    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> result = new ArrayList<>();
        String text = author.toUpperCase();
        //대문자로 만들어주는 메서드 , toLowerCase();
        for (Book<T> book : books) {
            if (book.getAuthor().toUpperCase().contains(text)) {
                result.add(book);
            }
            //대문자로 만들어서, 대문자로 검색
        }
        return result;
    }
}




