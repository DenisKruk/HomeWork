package com.company;

public class Task8 {
    public static void main(String[] args) {
        int array[]= new int[10];
        int array1[]= new int[10];
        double array2[]= new double[10];
        int i=0;
        int a=0;
        System.out.println("Первый массив");
        array = getArray(array, i);
        System.out.println("\nВторой массив");
        array1 = getArray(array1, i);
        System.out.println("\nТретий массив");
        array2 =  getArrayDefrance(array,array1, array2);
        System.out.println();
        getIntFromArray2(array,array1, a);

    }

    private static int getIntFromArray2(int[] array, int[] array1,int a) {
        for(int n=0;n<array.length;n++){
            if(array[n]%array1[n]==0){
                a+=1;
            }
        }
        System.out.println("Колличество целых в 3-ем массиве = "+a);
        return a;
    }

    private static double[] getArrayDefrance(int[] array, int[] array1, double[] array2) {
        for(int j =0; j<array.length;j++){
            array2[j]=(double) array[j]/array1[j];
            System.out.print(array2[j]+", ");
        }
        return array2;
    }

    private static int[] getArray(int[] array, int i) {
        for ( i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *(10-1)) + 1;
            System.out.print(array[i] + ",");
        }
        return array;
    }
}
