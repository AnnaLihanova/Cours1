package ru.skypro.ObjectsAndClasses.middle;

import ru.skypro.ObjectsAndClasses.min.Author;
import ru.skypro.ObjectsAndClasses.min.Book;

import static ru.skypro.ObjectsAndClasses.min.Book.addBook;
import static ru.skypro.ObjectsAndClasses.min.Book.printBook;

public class Middle_Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book newBook = new Book("Dandelion Wine", new Author("Ray", "Bredbury"), 1957);
        addBook(books, newBook);
        addBook(books, new Book("451 Fahrenheit", new Author("Ray", "Bredbury"), 1996));
        addBook(books, new Book("War and Peace", new Author("Lev", "Tolstoy"), 2001));
        addBook(books, new Book("Олеся", new Author("Александр", "Куприн"), 1898));
        addBook(books, new Book("Oblomov", new Author("Ivan", "Goncharov"), 2011));

        for (Book book : books) {
            if (book != null) {
                printBook(book);
            }

        }


    }
}
