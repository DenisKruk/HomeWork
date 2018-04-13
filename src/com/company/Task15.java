package com.company;

public class Task15 {
    public static void main(String[] args) {
        int array[] = new int[8];
        array = getArray(array);
        System.out.println();
        newArray(array);
    }

    private static void newArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + ", ");
        }
    }

    private static int[] getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((10+1)-1) + 1);
            System.out.print(array[i] + ", ");
        }
        return array;
    }
}
