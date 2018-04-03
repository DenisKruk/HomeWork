package com.company;

public class Task9 {
    public static void main(String[] args) {
        int array[] = new int[11];
        int i=0;
        array = getArray(array, i);
        System.out.println();
        mostPopularIntInArray(array);
    }

    private static void mostPopularIntInArray(int[] array) {

         int n = 0;
        int count = 0;
        for (int num1 : array) {
            int countN = frequensy(array, num1);
            if (count < countN) {
                n = num1;
                count = countN;
            }
        }

        System.out.println("Число " + n + " повторяется " + count + " раз");

    }

    static int frequensy(int[] array, int i) {
        int f = 0;
        int n=0;
        for (int d : array) {
            if (i == d) {
                f++;
                n=d;
            }

        }
       // System.out.print(n +"  "+f+";\n");

        return f;

    }


    private static int[] getArray(int[] array, int i) {
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (2 -(-1))) + (-1);
            System.out.print(array[i] + ",");
        }
        return array;
    }
}
