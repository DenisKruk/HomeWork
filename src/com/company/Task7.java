package com.company;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task7 {
    public static void main(String[] args) {
        int array[] = new int[12];
        int i = 0;
        array = getArray(array, i);
        System.out.println();
        int maxInt = getMaxInt(array);
        int maxIntPlace = getMaxIntPlace(array, maxInt);

    }

    private static int getMaxIntPlace(int[] array, int maxInt) {
        for (int j = 0; j < array.length; j++) {
            if (maxInt == array[j]) {
                System.out.println("Индекс максимального значения в массиве  [" + j + "]");
            }
        }
        return maxInt;
    }

    private static int getMaxInt(int[] array) {
        OptionalInt max = Arrays.stream(array).max();
        System.out.println("Максимальное значение в массиве = " + max.getAsInt());
        return max.getAsInt();
    }

    private static int[] getArray(int[] array, int i) {
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (16 - (-15))) + (-15);
            System.out.print(array[i] + ",");
        }
        return array;
    }


}

