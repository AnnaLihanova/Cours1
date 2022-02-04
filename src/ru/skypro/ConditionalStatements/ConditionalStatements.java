package ru.skypro.ConditionalStatements;

public class ConditionalStatements {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        System.out.println("Задание 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void task2() {
        System.out.println("Задание 2");

        int clientOS = 1;
        int dateReleasePhone = 2015;
        if (clientOS == 0 && dateReleasePhone >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && dateReleasePhone < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && dateReleasePhone >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1 && dateReleasePhone < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    private static void task3() {
        System.out.println("Задание 3");

        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void task4() {
        System.out.println("Задание 4");

        int deliveryDistance = 32;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else {
            System.out.println("Потребуется дней: 3");
        }
        if (deliveryDistance > 100) {
            System.out.println("Карта не доставляется");
        }
    }

    private static void task5() {
        System.out.println("Задание 5");

        int monthNumber = 2;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - Зима");
                break;
            case 2:
                ;
                System.out.println("Февраль - Зима");
                break;
            case 3:
                ;
                System.out.println("Март - Весна");
                break;
            case 4:
                System.out.println("Апрель - Весна");
                break;
            case 5:
                System.out.println("Май - Весна");
                break;
            case 6:
                System.out.println("Июнь - Лето");
                break;
            case 7:
                System.out.println("Июль - Лето");
                break;
            case 8:
                System.out.println("Август - Лето");
                break;
            case 9:
                System.out.println("Сентябрь - Осень");
                break;
            case 10:
                System.out.println("Октябрь - Осень");
                break;
            case 11:
                System.out.println("Ноябрь - Осень");
                break;
            case 12:
                System.out.println("Декабрь - Зима");
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}
