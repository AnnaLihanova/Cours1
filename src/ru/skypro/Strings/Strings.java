package ru.skypro.Strings;

public class Strings {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName + ".");

        System.out.println("Task 2");
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        System.out.println("Task 3");
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);

        System.out.println("Task 4");
        fullName = fullName.replace("Ivanov; Ivan; Ivanovich", "Иванов Семён Семёнович");
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);

        //ДОП ЗАДАНИЕ
        System.out.println("Задание 4");
        String symbol = "aabccddefgghiijjkk";
        char[] symbolArr = symbol.toCharArray();
        for (int i = 0; i < symbolArr.length - 1; i++) {
            if (symbolArr[i] == symbolArr[i + 1]) {
                System.out.print(symbolArr[i]);
            }
        }

        System.out.println();
    }

}
