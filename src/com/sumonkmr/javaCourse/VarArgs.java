package com.sumonkmr.javaCourse;

public class VarArgs {

    // -- Write methods here
    // -- Varargs
    static int sumArr(int ... arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }// -- end sumArr

    public static void main(String[] args) {

        System.out.println("The result is : "+ sumArr(11,44,4)); //-- here we can add many arguments

    }
}
