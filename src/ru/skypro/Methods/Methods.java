package ru.skypro.Methods;

import java.time.LocalDate;

public class Methods {
    // ЗАДАЧА 1
    public static void printCheckLeapYearResult(int year) {
        boolean leapYear = CheckLeapYear(year);
        printCheckLeapYear(year, leapYear);
    }

    public static boolean CheckLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void printCheckLeapYear(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // ЗАДАЧА 2
    public static int checkOs(int os) {
        if (os == 0) {
            return 0;
        } else if (os == 1) {
            return 1;
        }
        return os;
    }

    public static void printChekYearDeviceAndOs(int os, int yaerDevice, int currYear) {
        if (checkOs(os) == 0 && yaerDevice == currYear) {
            System.out.println("Установите приложение для iOS");
        } else if (checkOs(os) == 0 && yaerDevice < currYear) {
            System.out.println("Установите lite-версию приложения для iOS");
        }
        if (checkOs(os) == 1 && yaerDevice == currYear) {
            System.out.println("Установите приложение для Android");
        } else if (checkOs(os) == 1 && yaerDevice < currYear) {
            System.out.println("Установите lite-версию приложения для Android");
        }
    }

    // ЗАДАЧА 3
    public static int calculationDayDelivery(int deliveryKm) {
        if (deliveryKm < 20) {
            return 1;
        } else if (deliveryKm >= 20 && deliveryKm < 60) {
            return 2;
        } else if (deliveryKm >= 60 && deliveryKm < 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void printCalculationDayDelivery(int deliveryKm) {
        if (calculationDayDelivery(deliveryKm) == 1) {
            System.out.println("Для доставки потребуется 1 день");
        } else if (calculationDayDelivery(deliveryKm) == 2) {
            System.out.println("Для доставки потребуется 2 дня");
        } else if (calculationDayDelivery(deliveryKm) == 3) {
            System.out.println("Для доставки потребуется 3 дня");
        }
        if (calculationDayDelivery(deliveryKm) == 4) {
            System.out.println("Карта не доставляется");
        }
    }

    //ЗАДАЧА 4
    public static void printSearchDouble(String symbol) {
        char[] symbolArr = symbol.toCharArray();
        for (int i = 0; i < symbolArr.length - 1; i++) {
            if (symbolArr[i] == symbolArr[i + 1]) {
                System.out.println("Найден задвой символа - " + symbolArr[i]);
                return;
            }
        }
    }

    //ЗАДАЧА 5
    public static void printReversName(char[] fullName) {
        for (int i = fullName.length - 1; i >= 0; i--) {
            System.out.print(fullName[i]);
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int currentYear = 2022;
        printCheckLeapYearResult(currentYear);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOs = 1;
        int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();
        printChekYearDeviceAndOs(clientOs, clientDeviceYear, currentYear);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int deliveryDistance = 32;
        printCalculationDayDelivery(deliveryDistance);
    }

    public static void task4() {
        System.out.println("Задание 4");
        String symbols = "aabccddefgghiijjkk";
        printSearchDouble(symbols);
    }

    public static void task5() {
        System.out.println("Задание 5");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        printReversName(reverseFullName);
    }
}




