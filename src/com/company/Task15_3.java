package com.company;

public class Task15_3 {
    public static void main(String[] args) {
        int array[] = new int[4];
        int min = 10;
        int max = 99;
        array = getArray(array, min, max);
        upPosled(array);
    }

    private static void upPosled(int[] array) {
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
            System.out.println("\nПоследовательность строго возрастающая");
        } else {
            System.out.println("\nПоследовательность не является строго возрастающей");
        }
    }


    private static int[] getArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * ((max + 1) - min)) + min);
            System.out.print(array[i] + ", ");
        }
        return array;
    }
}
