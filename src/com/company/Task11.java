package com.company;

public class Task11 {
    public static void main(String[] args) {
        int array[] = new int[12];
        int i = 0;
        int a = 0;
        int b = 0;
        array = getArray(array, a, b);
        printArray(array);

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private static int[] getArray(int[] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (11 - (-10))) + (-10);
            if (array[i] > 0) {
                a++;
            }
            if (array[i] < 0) {
                b++;
            }
            if (array[i] == 0) {
                i--;
            }
            if (a > array.length / 2) {
                a -= 1;
                i = i - 1;
            }
            if (b > array.length / 2) {
                b -= 1;
                i = i - 1;
            }
        }

        return array;
    }
}
