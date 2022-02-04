package ru.skypro.ObjectsAndClasses.hard;

import ru.skypro.ObjectsAndClasses.min.Author;
import ru.skypro.ObjectsAndClasses.min.Book;

public class Hard_Main {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook(new Book("Dandelion Wine", new Author("Ray", "Bredbury"), 1957));
        library.addBook(new Book("451 Fahrenheit", new Author("Ray", "Bredbury"), 1996));
        library.addBook(new Book("War and Peace", new Author("Lev", "Tolstoy"), 2001));
        library.addBook(new Book("Олеся", new Author("Александр", "Куприн"), 1898));
        library.addBook(new Book("Oblomov", new Author("Ivan", "Goncharov"), 2011));

        library.printBookAbout();

//        library.changePublicationYear("War and Peace", 2005);
//
//        library.printInformationAboutBook("451 Fahrenheit");

    }
}