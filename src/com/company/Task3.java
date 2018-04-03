package com.company;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 11) + 1;
            System.out.print(array[i] + ",");
        }
        System.out.println("\n");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                array[j] = 0;
            }
            System.out.print( array[j]+",");
        }
    }
}
