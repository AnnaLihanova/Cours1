package ru.skypro.Cycles;

public class Cycles {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задание 1");

        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 2");

        for (int friday = 4; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    private static void task3() {
        System.out.println("Задание 3");

        int currentYear = 2022;
        int pastPeriod = currentYear - 200;
        int nextPeriod = currentYear + 100;
        for (int comet = 0; comet < nextPeriod; comet += 79) {
            if (comet > pastPeriod && comet < nextPeriod)
                System.out.println(comet);
        }
    }
}
