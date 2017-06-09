package lesson14.Library;


import java.util.Arrays;

public class Book {
   private String bookName;
   private int yearOfPublication;
   private long bookId;
   private String typeOfBook;
   private String author;
   private boolean issue;


    public Book(String bookName, int yearOfPublication, long bookId, String typeOfBook, String author, boolean issue) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.bookId = bookId;
        this.typeOfBook = typeOfBook;
        this.author = author;
        this.issue = issue;

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIssue() {
        return issue;
    }

    public void setIssue(boolean issue) {
        this.issue = issue;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", bookId=" + bookId +
                ", typeOfBook='" + typeOfBook + '\'' +
                ", author='" + author + '\'' +
                ", issue=" + issue +
                '}';
    }
}
