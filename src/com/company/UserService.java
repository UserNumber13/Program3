package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

        static List<User> list=new ArrayList<>() ;
        public static List<User> dataBase (){
            return list;
        }

        static
        {
            list.add(User.createUser(1234, "Иван"));
            list.add(User.createUser(1345, "Виктор"));
        }

    public static void main(String[] args) {
        System.out.println("Enter the Name");
        Scanner in=new Scanner(System.in);
        String findUser=in.nextLine();
        for (User user: dataBase()) {
            if (user.getName().equals(findUser)) {
                System.out.println("Такой User существует!");
                return;}
                else{
                System.out.println("Такого Userа не существует");
                return;
                }
        }
    }
    }

