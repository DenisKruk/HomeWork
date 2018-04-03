package com.company;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int [5];
        int[] array1 = new int[5];
        double sumArray = 0;
        double avverageArray = 0;
        double sumArray1 = 0;
        double avverageArray1 = 0;

        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 6) + 0;
            sumArray += array[i];
            System.out.print(array[i] + ",");
            avverageArray = sumArray / array.length;
        }
        System.out.println("");
        for (int j = 0; j < 5; j++) {
            array1[j] = (int) (Math.random() * 6) + 0;
            sumArray1 += array1[j];
            System.out.print(array1[j] + ",");
            avverageArray1 = sumArray1/array1.length;
        }
        System.out.println(' ');
if(avverageArray-avverageArray1>0){
    System.out.println("Первый массив больше");
}
else if(avverageArray-avverageArray1<0){
    System.out.println("Второй массив больше");
}
else if(avverageArray-avverageArray1==0){
    System.out.println("Массивы равны");
}

    }
}
