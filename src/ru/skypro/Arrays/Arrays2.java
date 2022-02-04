package ru.skypro.Arrays;

public class Arrays2 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] spending = new int[30];
        for (int i = 0; i < spending.length; i++) {
            spending[i] = random.nextInt(100_000) + 100_000;
        }
        return spending;
    }

    public static void main(String[] args) {
        // write your code here
        task1();
        task2();
    }

    private static void task1() {
        System.out.println("Задания 1-3");
        int[] spending = generateRandomArray();
        int sumSpendingPerMonth = 0;
        for (int i = 0; i < spending.length; i++) {
            sumSpendingPerMonth = sumSpendingPerMonth + spending[i];
            // ЛИБО:
            // for (int i : spending)
            // sumSpendingPerMonth += i
        }
        System.out.println("Сумма трат за месяц составила " + sumSpendingPerMonth + " рублей");
        int maxSpending = 99_999;
        int minSpending = 200_001;
        for (int i = 0; i < spending.length; i++) {
            if (spending[i] > maxSpending) {
                maxSpending = spending[i];
            }
            if (spending[i] < minSpending) {
                minSpending = spending[i];
            }
            // ЛИБО:
            // int  maxSpending = spending[0];
            // int  minSpending = spending[0];
            // for (int i : spending)
            // if (i < minSpending) {
            // minSpending = i;
            //}
            //...
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
        float averageSpending = sumSpendingPerMonth / (float) spending.length; // можно записать как (spending.lenght * 1f)
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
    }

    private static void task2() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
