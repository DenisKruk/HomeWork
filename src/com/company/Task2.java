package com.company;

public class Task2 {
    public static void main(String[] args) {
        int a = 0;
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 0;
            System.out.print(array[i] + ",");

            if (array[i] % 2 == 0 & array[i] != 0) {
                a++;
            }
        }
        System.out.println("\nКолличество четных " + a);
    }
}
