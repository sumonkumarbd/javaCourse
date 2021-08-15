package com.sumonkmr.javaCourse;

public class MethodOverLoading {
     // -- Methods
    static void msg (){
        System.out.println("Hi This is a method of class");
    } // -- end msg

    static void change1 (int a){
        a = 20;
    } // --end change1


    public static void main(String[] args) {
        // -- Executable code

       // msg();

        // -- Changing int
        int x = 70;
        change1(x);
        System.out.println("So x is :"+x);




    } // -- end main
} // --end class
