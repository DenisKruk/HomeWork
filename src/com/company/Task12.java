package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int min = 3;
        int n;
        n = getNum(min);
        int array[] = new int[n];
        array = getArray(array, n);
        int array1Length = getArray1Length(array);
        int array1[] = new int[array1Length];
        array1 = getArray1(array, array1);
    }

    private static int getArray1Length(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                j = j + 1;
            }
        }
        return j;
    }


    private static int[] getArray1(int[] array, int[] array1) {
        int a = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                array1[a] = array[i];
                System.out.print(array1[a] + ", ");
                a = a + 1;
            }
        }

        return array1;
    }

    private static int[] getArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (n + 1));
            System.out.print(array[i] + ", ");
        }
        return array;
    }

    private static int getNum(int min) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от " + min);
        int result;
        try {
            result = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" Вы ввели не числою");
            return getNum(min);
        }
        if (result < min) {
            System.out.println("Число не от " + min);
            return getNum(min);
        }
        return result;
    }
}

