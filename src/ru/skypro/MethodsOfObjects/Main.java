package ru.skypro.MethodsOfObjects;

public class Main {

    public static void main(String[] args) {
        Book oblomov = new Book("Обломов", new Author("Иван", "Гончаров"), 1859);
        oblomov.setPublicationYear(2021);
        System.out.println(oblomov.toString());

        Book olesia = new Book("Олеся", new Author("Александр", "Куприн"), 1898);
        System.out.println(olesia.toString());
        System.out.println(olesia.hashCode());
        Book olesia1 = new Book("Олеся", new Author("Александр", "Куприн"), 1898);
        System.out.println(olesia1.hashCode());


        if (olesia.equals(olesia1)) {
            System.out.println("Это одинаковые книги");
        } else {
            System.out.println("Это разные книги");
        }
    }
}
