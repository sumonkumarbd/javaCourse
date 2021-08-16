package com.sumonkmr.javaCourse;

public class MethodOverLoading {
     // -- Methods
    static void msg (){
        System.out.println("Hi This is a method of class");
    } // -- end msg

    static void change1 (int a){
        a = 20;
    } // --end change1

    // -- change2
    static void change2(int [] arr){
        arr [0] = 88;
    } // -- end change2

    // -- methode overloding
    //we can assign same name of meny methodes but they have to pass deffarent parameters.
    static int sum(int a, int b){
        return a+b;

    }// --end sum

    static int sum(int a, int b, int c){
        return a+b+c;

    }// --end sum


    public static void main(String[] args) {
        // -- Executable code

       // msg();

        // -- Changing int
       /* int x = 70;
        change1(x);
        System.out.println("So x is :"+x);*/    // --int type is not to be change by methods

        // -- changing array
       /* int [] marks = {56,77,43,32};
        change2(marks);
        System.out.println(marks[0]);  // -- array has can change value by methods*/

        // -- calling sum method
        System.out.println("The result is : "+ sum(10, 8));
        System.out.println("The result is : "+ sum(10, 8, 4)); //we can assign same name of meny methodes but they have to pass deffarent parameters.




    } // -- end main
} // --end class
