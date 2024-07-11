import java.time.LocalDate;
import java.util.Arrays;

public class OOP {
  public static void main(String[] args) {
    final String RED = "\033[0;31m";
    final String BLUE = "\033[0;34m";

    Book newBook = new Book("The Stranger", "9780394533056", LocalDate.now());
    Author newAuthor = new Author("Albert Camus", new Book[]{newBook});
    newBook.setAuthors(new Author[]{newAuthor});
    User newUser = new User("Billy", new Book[]{newBook}, false);

    System.out.println(RED + "\n=== Book ===" + BLUE);
    System.out.printf("Title: %s%nISBN: %s%nAuthor(s): %s%nBorrowed at: %s%n", newBook.getTitle(),
            newBook.getISBN(), newBook.getAuthors()[0].getName(), newBook.getDate());

    System.out.println(RED + "\n=== Author ===" + BLUE);
    System.out.printf("Name: %s%nBooks: %s%n", newAuthor.getName(), newAuthor.getBooks()[0].getTitle());

    System.out.println(RED + "\n=== User ===" + BLUE);
    System.out.printf("Name: %s%nBooks: %s%nIs banned: %s%n", newUser.getName(),
            newUser.getBorrowedBooks()[0].getTitle(), newUser.getIsBanned());


  }
}

class Book {
  private String title;
  private String ISBN;
  private Author[] authors;
  private LocalDate borrowedAt;

  Book(String title, String ISBN, LocalDate borrowedAt) {
    this.title = title;
    this.ISBN = ISBN;
    this.borrowedAt = borrowedAt;
  }

  public String getTitle() {
    return title;
  }

  public String getISBN() {
    return ISBN;
  }

  public Author[] getAuthors() {
    return authors;
  }

  public LocalDate getDate() {
    return borrowedAt;
  }

  public void setAuthors(Author[] authors) {
    this.authors = authors;
  }
}

class Author {
  private String name;
  private Book[] books;

  Author(String name, Book[] books) {
    this.name = name;
    this.books = books;
  }

  public String getName() {
    return name;
  }

  public Book[] getBooks() {
    return books;
  }
}

class User {
  private String name;
  private Book[] borrowedBooks;
  private boolean isBanned;

  User(String name, Book[] borrowedBooks, boolean isBanned) {
    this.name = name;
    this.borrowedBooks = borrowedBooks;
    this.isBanned = isBanned;
  }

  public String getName() {
    return name;
  }

  public Book[] getBorrowedBooks() {
    return borrowedBooks;
  }

  public boolean getIsBanned() {
    return isBanned;
  }

}