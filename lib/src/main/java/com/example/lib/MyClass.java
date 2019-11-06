package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {

        double height, weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入身高體重(以空白鍵分開)：");
        height = scanner.nextInt();
        weight = scanner.nextInt();

        double height_m=height/100;

        double BMI=weight/(height_m*height_m);
        System.out.println("BMI="+BMI);

    }
}
