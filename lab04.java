//package com.company;
//import java.util.Scanner;
//import java.util.ArrayList;
public class lab04 {

    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static int minArray(int[] arr) {
        int i;

        int min = arr[0];

        for (i = 1; i < 3; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static String BMI(int weight, double height) {
        int h = (int) (height*100);

        int BMI = (weight*10000) / (h * h );

        if (BMI < 18.5)
            return "Thieu can";

        if (BMI > 18.5 && BMI < 24.99)
            return "Binh thuong";

        if (BMI > 23 && BMI < 24.99)
            return "Thua can";

        if (BMI > 25)
            return "Beo phi";

        return null;
    }

    public static void main(String[] args) {

        int a=0, b=2, weight=48;
        int[] arr = {1,2,3};
        double height= 1.58;
        //int[] arr = {1,2,3};
        System.out.println("Gia tri lon nhat la : " + max(a, b) + "\n----------------------");
        System.out.println("Gia tri nho nhat cua mang la : " + minArray(arr) + "\n----------------------");
        System.out.println("Ket qua BMI : " + BMI(weight,height));


    }
}
