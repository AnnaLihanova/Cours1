package ru.skypro.MethodsOfObjects;

import java.util.Objects;

public class Author {
    private final String authorLastName;
    private final String authorFirstName;

    public Author(String authorFirstName, String authorLastName) {
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    @Override
    public boolean equals(Object authors) {
        if (this == authors) return true;
        if (authors == null || getClass() != authors.getClass()) return false;
        Author author = (Author) authors;
        return authorLastName.equals(author.authorLastName) && authorFirstName.equals(author.authorFirstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorLastName, authorFirstName);
    }
}