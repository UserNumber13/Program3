package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Verification {
    public static void main(String[] args) {
    List<Integer> list;
       list = new ArrayList<Integer>(100);
       list.add(2);
       list.add(3);
       list.add(5);

        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        for(int j=0; j<list.size(); j++){
            if(list.get(j).equals(num)) {
                System.out.println("Такое число присутствует!");
                return;
            }
            else {
                System.out.println("Такого числа нет!");
                return;
            }
    }}}

