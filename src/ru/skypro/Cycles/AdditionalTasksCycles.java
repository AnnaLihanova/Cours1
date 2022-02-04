package ru.skypro.Cycles;

public class AdditionalTasksCycles {
    public static void main(String[] args) {
        task4();
        task5();
    }

    private static void task4() {
        System.out.println("Задание 4");

        for (int a = 1; a <= 30; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a + ": ping pong");
            } else if (a % 3 == 0) {
                System.out.println(a + ": ping");
            } else if (a % 5 == 0) {
                System.out.println(a + ": pong");
            } else {
                System.out.println(a + ":");
            }
        }
    }

    private static void task5() {
        System.out.println("Задание 5");

        int numberAfter = 8;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= numberAfter; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
