package com.company;

public class Task14 {
    public static void main(String[] args) {
        int min = -20;
        int max = 20;
        int sum = 0;
        for (int i = min; i <= max; i += 2) {
            if (i != 0) {
                sum += i;
                //  System.out.println(sum+" ");
            }
        }
        System.out.println("Сумма всех четных в диапазоне от " + min + " до " + max + " равна " + sum);
    }
}
