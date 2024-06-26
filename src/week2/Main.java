package week2;

import java.util.*;

public class Main {

    public class Main {
        public static void main(String[] args) {
            // String 타입의 식별자를 사용하는 BookShelf 객체 생성
            BookShelf<String> bookShelf = new BookShelf<>();

            // Integer 타입의 식별자를 사용하는 BookStack 객체 생성
            BookStack<Integer> bookStack = new BookStack<>();

            Scanner scanner = new Scanner(System.in);

            // 도서 정보 입력 받기
            System.out.print("도서 제목을 입력하세요: ");
            String title = scanner.nextLine();

            System.out.print("도서 저자를 입력하세요: ");
            String author = scanner.nextLine();

            System.out.print("BookShelf에 추가할 도서의 식별자(String)를 입력하세요: ");
            String shelfIdentifier = scanner.nextLine();

            System.out.print("BookStack에 추가할 도서의 식별자(Integer)를 입력하세요: ");
            int stackIdentifier = scanner.nextInt();

            // Book 객체 생성 및 BookShelf와 BookStack에 추가
            Book<String> shelfBook = new Book<>(title, author, shelfIdentifier);
            bookShelf.addBook(shelfBook);

            Book<Integer> stackBook = new Book<>(title, author, stackIdentifier);
            bookStack.pushBook(stackBook);

            // BookShelf에서 도서 제목으로 검색
            System.out.print("검색할 도서 제목을 입력하세요: ");
            scanner.nextLine();  // 버퍼 정리
            String searchTitle = scanner.nextLine();
            List<Book<String>> titleSearchResults = bookShelf.searchByTitle(searchTitle);

            System.out.println("제목으로 검색한 결과:");
            for (Book<String> book : titleSearchResults) {
                System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor() + ", 식별자: " + book.getIdentifier());
            }

            // BookShelf에서 도서 저자로 검색
            System.out.print("검색할 도서 저자를 입력하세요: ");
            String searchAuthor = scanner.nextLine();
            List<Book<String>> authorSearchResults = bookShelf.searchByAuthor(searchAuthor);

            System.out.println("저자로 검색한 결과:");
            for (Book<String> book : authorSearchResults) {
                System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor() + ", 식별자: " + book.getIdentifier());
            }

            // BookStack에서 도서 꺼내기 (popBook)
            try {
                Book<Integer> poppedBook = bookStack.popBook();
                System.out.println("Stack에서 꺼낸 도서: 제목: " + poppedBook.getTitle() + ", 저자: " + poppedBook.getAuthor() + ", 식별자: " + poppedBook.getIdentifier());
            } catch (EmptyStackException e) {
                System.out.println("Stack이 비어있습니다.");
            }

            // BookStack에서 맨 위의 도서 확인 (peekBook)
            try {
                Book<Integer> peekedBook = bookStack.peekBook();
                System.out.println("Stack의 맨 위 도서: 제목: " + peekedBook.getTitle() + ", 저자: " + peekedBook.getAuthor() + ", 식별자: " + peekedBook.getIdentifier());
            } catch (EmptyStackException e) {
                System.out.println("Stack이 비어있습니다.");
            }

            // BookStack이 비어있는지 확인 (isEmpty)
            boolean isStackEmpty = bookStack.isEmpty();
            System.out.println("Stack이 비어있는지 여부: " + isStackEmpty);
        }
    }
}
