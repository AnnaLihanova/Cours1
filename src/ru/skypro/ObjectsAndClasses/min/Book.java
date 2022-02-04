package ru.skypro.ObjectsAndClasses.min;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publicationYear;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {

        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название книги: " + getBookName() + "; " + "Автор: " + getAuthor().getAuthorFirstName() + " " + getAuthor().getAuthorLastName() + "; " + "Год издания: " + getPublicationYear();
    }


    @Override
    public boolean equals(Object books) {
        if (this == books) return true;
        if (books == null || getClass() != books.getClass()) return false;
        Book book = (Book) books;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }

    public static boolean addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    public static void printBook(Book book) {
        System.out.println(String.join(": ",
                book.getAuthor().getAuthorFirstName() + " " + book.getAuthor().getAuthorLastName(), book.getBookName(), String.valueOf(book.getPublicationYear())));
    }
}
