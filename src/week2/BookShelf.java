package week2;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
    private List<Book<T>> books;

    // 기본 생성자
    public BookShelf() {
        this.books = new ArrayList<>();
    }

//    // 도서 추가 메소드
//    @Override
//    public void addBook(Book<T> book) {
//        books.add(book);
//    }
//
//    // 도서 삭제 메소드
//    @Override
//    public void removeBook(Book<T> book) {
//        books.remove(book);
//    }
//
//    // 도서 제목으로 검색 메소드
//    @Override
//    public List<Book<T>> searchByTitle(String title) {
//        List<Book<T>> result = new ArrayList<>();
//        for (Book<T> book : books) {
//            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//
//    // 도서 저자로 검색 메소드
//    @Override
//    public List<Book<T>> searchByAuthor(String author) {
//        List<Book<T>> result = new ArrayList<>();
//        for (Book<T> book : books) {
//            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
//                result.add(book);
//            }
//        }
//        return result;
    }
}




