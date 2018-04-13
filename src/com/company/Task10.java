package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrayLenght = getArrayLen(scan);
        int array[] = new int[arrayLenght];
        System.out.println("Массив");
        array = getArray(array);
        System.out.println();
        int summLeft = getSummLeft(array);
        int summRight = getSummRight(array);
        findTheDiffrence(summLeft, summRight);
    }

    private static void findTheDiffrence(int summLeft, int summRight) {
        if (summLeft > summRight) {
            System.out.println("Сумма модулей левой половины массива больше");
        } else if (summLeft < summRight) {
            System.out.println("Сумма модулей правой половины массива больше");
        } else if (summLeft == summRight) {
            System.out.println("Суммы модулей левой и правой половины массива равны");
        }
    }

    private static int getSummRight(int[] array) {
        int summRight = 0;
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            summRight += array[i];
        }
        System.out.println("Сумма модулей правой половины массива равна " + summRight);
        return summRight;
    }


    private static int getSummLeft(int[] array) {
        int summLeft = 0;
        for (int i = 0; i < array.length / 2; i++) {
            summLeft += array[i];
        }
        System.out.println("Сумма модулей левой половины массива равна " + summLeft);
        return summLeft;
    }

    private static int[] getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (6 - (-5))) + (-5);
            System.out.print(array[i] + ", ");
        }
        return array;
    }

    private static int getArrayLen(Scanner scan) {
        while (true) {
            System.out.println("Введите четное положительное число");

            int arrayLenght = scan.nextInt();
            if (arrayLenght % 2 != 0 || arrayLenght <= 0) {
                System.out.println("Вы ввели не верное число");
            } else {
                return arrayLenght;
            }
        }
    }
}
