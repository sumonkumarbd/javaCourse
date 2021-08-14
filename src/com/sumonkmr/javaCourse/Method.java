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
    } // --End menus method

    // -- method invocation
    int invocation(int x , int y){
        int result = x * y;
        return result;
    } // -- end method invocation


    public static void main(String[] args) {
//        int sresult = sum(3,5);
//        System.out.printf("This is an Example of How to use Method. And The Result is : %d %n" ,sresult);
//        int mresult = menus(30,25);
//        System.out.printf("This is an Example of How to use Method.This case I'm using here menus oparation And The Result is : %d",mresult);

        // -- making object of invocation
        Method mobj = new Method();
        int a = 10;
        int b = 5;s
        int res = mobj.invocation(a , b);
        System.out.printf("This is an example of invocation or creat object of class. And the result is : %d %n ",res);

    }
}
