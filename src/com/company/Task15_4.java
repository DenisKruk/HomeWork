package com.company;

public class Task15_4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        array = getarray(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ",");
        }
    }

    private static int[] getarray(int[] array) {
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < 20; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}
