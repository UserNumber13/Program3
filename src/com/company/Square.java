package com.company;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Введите значение ширины прямоугольника a");
        int a=in.nextInt();
        System.out.println("Введите значение длинны прямоугольника и");
        int b=in.nextInt();
        System.out.println("Периметр равен: "+(a*2+b*2));
    }
}
