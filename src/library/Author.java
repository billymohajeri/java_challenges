package library;

public class Author {
  private String _name;
  private Book[] _books;

  Author(String name) {
    _name = name;
  }

  public String getName() {
    return _name;
  }

  public Book[] getBooks() {
    return _books;
  }

  public void setBooks(Book[] books) {
    _books = books;
  }
}
