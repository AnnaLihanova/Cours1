package ru.skypro.Arrays;

public class Arrays {
    public static void main(String[] args) {

        task1();
        task3();
        task4();

    }
    private static void task1() {
        System.out.println("Задание 1 и 2");
        int[] arrInteger = new int[3];
        arrInteger[0] = 1;
        arrInteger[1] = 2;
        arrInteger[2] = 3;
        for (int i = 0; i < arrInteger.length; i++) {
            if (i < arrInteger.length - 1) {
                System.out.print(arrInteger[i] + ", ");
            }
            if (i == arrInteger.length - 1) {
                System.out.print(arrInteger[i]);
            }
        }
        System.out.println();
        double[] fraction = {1.57, 7.654, 9.986};
        for (int i = 0; i < fraction.length; i++) {
            if (i < fraction.length - 1) {
                System.out.print(fraction[i] + ", ");
            }
            if (fraction[i] == fraction.length) {
                System.out.print(fraction[i]);
            }
        }
        System.out.println();
        char[] myName = {65, 110, 110, 97};
        for (int i = 0; i < myName.length; i++) {
            if (i < myName.length - 1) {
                System.out.print(myName[i] + ", ");
            }
            if (i == myName.length - 1) {
                System.out.println(myName[i]);
            }
        }
    }
    private static void task3() {
        System.out.println("Задание 3");
        int[] arrInteger = {1, 2, 3};
        for (int i = arrInteger.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrInteger[i] + ", ");
            }
            if (i == 0) {
                System.out.println(arrInteger[i]);
            }
        }
        double[] fraction = {1.57, 7.654, 9.986};
        for (int i = fraction.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(fraction[i] + ", ");
            }
            if (i == 0) {
                System.out.println(fraction[i]);
            }
        }
        char[] myName = {65, 110, 110, 97};
        for (int i = myName.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(myName[i] + ", ");
            }
            if (i == 0) {
                System.out.println(myName[i]);
            }
        }
    }
    private static void task4() {
        System.out.println("Задание 4");
        int[] arrInteger = {1, 2, 3};
        for (int i = 0; i < arrInteger.length; i++) {
            if (arrInteger[i] % 2 == 0) {
                System.out.print(arrInteger[i] + " ");
            } else {
                arrInteger[i] = arrInteger[i] + 1;
                System.out.print(arrInteger[i] + " ");
            }
        }
    }


}
