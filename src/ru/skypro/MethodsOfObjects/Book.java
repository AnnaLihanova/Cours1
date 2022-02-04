package ru.skypro.MethodsOfObjects;

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

    @Override
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
}
