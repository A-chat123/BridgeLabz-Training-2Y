// 7. Library Management System
import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String msg){super(msg);} }
class InvalidReturnException extends Exception { public InvalidReturnException(String msg){super(msg);} }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String msg){super(msg);} }

class Library {
    Map<String, Boolean> books = new HashMap<>();
    Map<String, Integer> userBorrowCount = new HashMap<>();

    public Library() {
        books.put("Java", true);
        books.put("Python", false);
    }

    public void borrowBook(String user, String book)
            throws BookNotAvailableException, UserLimitExceededException {
        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException("Book not available!");
        if (userBorrowCount.getOrDefault(user, 0) >= 5)
            throw new UserLimitExceededException("Borrow limit exceeded!");
        books.put(book, false);
        userBorrowCount.put(user, userBorrowCount.getOrDefault(user, 0) + 1);
        System.out.println("Book borrowed successfully!");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook("Amit", "Python");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

