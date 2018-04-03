package com.company;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[4];
        int i=0;
        array = getArray(array,i);
        System.out.println();
        int grows[] = arrayGrows(array);
    }

    private static int[] arrayGrows(int[] array) {
            if (array[0]<array[1]&&array[1]<array[2]&&array[2]<array[3]){
                System.out.println("массив является строго возрастающей последовательностью");
                }
                else {
                System.out.println("массив не является строго возрастающей последовательностью");
        }
            return array;
    }

        private static int[] getArray (int[] array, int i){
            for ( i = 0; i < 4; i++) {
                array[i] = (int) (Math.random() *(100-10)) + 10;
                System.out.print(array[i] + ",");
            }
            return array;
        }
    }

