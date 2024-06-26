package week2;
// 도서 추가, 도서 삭제, 도서 제목 검색, 도서 저자 검색

import java.util.List;
//List 사용 선언

public interface BookManager<T> {

    void addBook(Book<T> book); // 도서 추가

    void removeBook(Book<T> book); // 도서 삭제

    List<Book<T>> searchByTitle(String title); // 도서 제목 검색

    List<Book<T>> searchByAuthor(String author); // 도서 저자 검색
}
