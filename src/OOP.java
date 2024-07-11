import java.util.Date;

public class OOP {
  public static void main(String[] args) {
  }
}

class Book {
  private String title;
  private String ISBN;
  private Author[] authors;
  private Date borrowedAt;

  Book(String title, String ISBN, Author[] authors, Date borrowedAt) {
    this.title = title;
    this.ISBN = ISBN;
    this.authors = authors;
    this.borrowedAt = borrowedAt;
  }

  public String getTitle() {
    return title;
  }
}

class Author {
  public String name;
  public Book[] books;

  Author(String name, Book[] books) {
    this.name = name;
    this.books = books;
  }
}

