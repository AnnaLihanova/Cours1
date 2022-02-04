package ru.skypro.ObjectsAndClasses.hard;

import ru.skypro.ObjectsAndClasses.min.Book;

public class Library {
    private final Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public boolean addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    public void printBookAbout() {
        for (Book book : books) {
//            System.out.println(book.getBookName() + " by " + book.getAuthor().getAuthorFirstName() + book.getAuthor().getAuthorLastName() + " was published in " + book.getPublicationYear());
            StringBuilder sb = new StringBuilder();
            sb.append(book.getBookName());
            sb.append(" by ");
            sb.append(book.getAuthor().getAuthorFirstName());
            sb.append(" ");
            sb.append(book.getAuthor().getAuthorLastName());
            sb.append(" was published in ");
            sb.append(book.getPublicationYear());
            String sbResult = sb.toString();
            System.out.println(sb);
        }
    }

    public boolean changePublicationYear(String bookName, int newPublicationYear) {
        for (Book book : books) {
            if (book != null && book.getBookName().equals(bookName)) {
                book.setPublicationYear(newPublicationYear);
                return true;
            }
        }
        return false;
    }

    public void printInformationAboutBook(String bookName) {
        for (Book book : books) {
            if (book != null && book.getBookName().equals(bookName)) {
                System.out.println(book.getBookName() + " by " + book.getAuthor().getAuthorFirstName() + book.getAuthor().getAuthorLastName() + " was published in " + book.getPublicationYear());
                return;
            }
        }
        System.out.println("Книга " + bookName + "не найдена");
    }
}