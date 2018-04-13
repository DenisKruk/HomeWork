package com.company;

public class Task13 {
    public static void main(String[] args) {
        int array[] = new int[10];
        array = getArray(array);
        System.out.println();
        printlnArray(array);

    }

    private static void printlnArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] getArray(int[] array) {
        int a = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            System.out.print(array[i] + " ");
            a = a + 2;
        }
        return array;
    }
}
