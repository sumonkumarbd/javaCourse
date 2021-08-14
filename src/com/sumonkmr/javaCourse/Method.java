package com.sumonkmr.javaCourse;

public class Method {

    // --Write method here

    // -- sum Method
    static int sum(int x,int y){
        int z;
        z = x + y;
        return z;

    } // end sum Method

    // Start menus Method
    static int menus (int x,int y){
        int z = x - y;
        return z;
    }



    public static void main(String[] args) {
        int sresult = sum(3,5);
        System.out.printf("This is an Example of How to use Method. And The Result is : %d %n" ,sresult);
        int mresult = menus(30,25);
        System.out.printf("This is an Example of How to use Method.This case I'm using here menus oparation And The Result is : %d",mresult);

    }
}
