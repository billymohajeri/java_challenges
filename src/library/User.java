package library;

import java.util.ArrayList;

public class User {
  private String _name;
  private ArrayList<Book> _borrowedBooks;
  private boolean _isBanned;

  User(String name, ArrayList<Book> borrowedBooks, boolean isBanned) {
    _name = name;
    _borrowedBooks = borrowedBooks;
    _isBanned = isBanned;
  }

  public String getName() {
    return _name;
  }

  public ArrayList<Book> getBorrowedBooks() {
    return _borrowedBooks;
  }

  public boolean getIsBanned() {
    return _isBanned;
  }

}