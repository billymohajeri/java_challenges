package library;

import java.time.LocalDate;

public class Book {
  private String _title;
  private String _ISBN;
  private Author[] _authors;
  private LocalDate _borrowedAt;

  Book(String title, String ISBN) {
    _title = title;
    _ISBN = ISBN;
  }

  public String getTitle() {
    return _title;
  }

  public String getISBN() {
    return _ISBN;
  }

  public Author[] getAuthors() {
    return _authors;
  }

  public LocalDate getBorrowedAt() {
    return _borrowedAt;
  }

  public void setAuthors(Author[] authors) {
    _authors = authors;
  }

  public void setBorrowedAt(LocalDate borrowedAt) {
    _borrowedAt = borrowedAt;
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
