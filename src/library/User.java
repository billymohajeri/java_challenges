package library;

public class User {
  private String _name;
  private Book[] _borrowedBooks;
  private boolean _isBanned;

  User(String name, boolean isBanned) {
    _name = name;

    _isBanned = isBanned;
  }

  public String getName() {
    return _name;
  }

  public Book[] getBorrowedBooks() {
    return _borrowedBooks;
  }

  public boolean getIsBanned() {
    return _isBanned;
  }

}