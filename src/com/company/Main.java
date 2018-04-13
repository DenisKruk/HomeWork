package com.company;

public class Main {

    public static void main(String[] args) {
        int i, b, j;
        int a = 50;//длинна массива

        int[] array = new int[a];
        for (i = 0, b = 1; b < 100; b += 2, i++) {

            array[i] = b;
            System.out.print(array[i] + ",");
        }
        System.out.println('\n');
        for (j = a - 1; j >= 0; j--) {
            System.out.print(array[j] + ",");

        }
    }
}