package week2;

// 도서 추가 제거 반환 메소드

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books;

    // 기본 생성자
    public BookStack() {
        this.books = new Stack<>();
    }

    // 도서 추가 메소드
    public void pushBook(Book<T> book) {
        books.push(book);
    }

    // 도서 제거 및 반환 메소드
    public Book<T> popBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }
        return books.pop();
    }
//pop 자료형 값이 반환한다. 빼는거


    // 도서 반환(제거하지 않음) 메소드
    public Book<T> peekBook() {
        if (books.isEmpty()) {
            throw new EmptyStackException();
        }
        return books.peek();
    }
    //peek 빼지않는거

    // 스택이 비어있는지 여부를 반환하는 메소드
    public boolean isEmpty() {
        return books.isEmpty();
    }
}
