package com.company;

public class Task15_2 {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        arrayA = getArray(arrayA);
        System.out.println();
        arrayB = getArray(arrayB);
        System.out.println("\nСреднее арифметическое первого массива");
        double sumA = getSum(arrayA);
        System.out.println("\nСреднее арифметическое второго массива");
        double sumB = getSum(arrayB);
        System.out.println();
        findDiffrence(sumA, sumB);
    }

    private static void findDiffrence(double sumA, double sumB) {
        if (sumA > sumB) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if (sumA < sumB) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else if (sumA == sumB) {
            System.out.println("Среднее арифметическое первого и второго массивов равны");
        }
    }

    private static double getSum(int[] arrayA) {
        int sum = 0;
        double sarf = 0;
        for (int i = 0; i < arrayA.length; i++) {
            sum = sum + arrayA[i];
        }
        sarf = (double) sum / arrayA.length;
        System.out.print(sarf);
        return sarf;
    }

    private static int[] getArray(int[] arrayA) {
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 6);
            System.out.print(arrayA[i] + ", ");
        }
        return arrayA;
    }
}
