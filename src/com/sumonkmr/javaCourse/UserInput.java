package com.sumonkmr.javaCourse;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//        Code here
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = sc.next();
        System.out.println("Hi "+name+" "+"how old are you ?");
        byte age = sc.nextByte();
        System.out.println("Dear"+" "+name+" you are "+age+" "+"now!");

        if (name != null ) {
            for (int i = 0; i <= 5; i++){
                System.out.println(" ");
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
            }


        }
        System.out.print(" => Hi "+name+" I know you are "+age+" now! but you are in our team now !!!");



    }
}
