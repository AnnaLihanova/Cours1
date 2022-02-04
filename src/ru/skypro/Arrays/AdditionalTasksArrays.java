package ru.skypro.Arrays;

import java.util.Arrays;

public class AdditionalTasksArrays {
    public static void main(String[] args) {
        // write your code here
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    private static void task5() {
        System.out.println("Задание 5");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i == j) || (i == matrix.length - j - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        System.out.println("Задание 6");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.print(java.util.Arrays.toString(arr));
        System.out.println();
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        System.out.println(java.util.Arrays.toString(arr2));
    }

    private static void task7() {
        System.out.println("Задание 7");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(java.util.Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();

    }

    private static void task8() {
        System.out.println("Задание 8");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Сумма " + arr[i] + " и " + arr[j] + " = -2");
                }
                break;
            }
        }
    }

    private static void task9() {
        System.out.println("Задание 9");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println("Сумма " + arr[i] + " и " + arr[j] + " = -2");
                }
            }
        }

    }
}
