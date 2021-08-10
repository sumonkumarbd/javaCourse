package com.sumonkmr.javaCourse;

import java.util.Scanner;

public class SIMPLE_CALCULATOR {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int first_no = se.nextInt();

        System.out.print("Enter Seceond Number: ");
        int seceond_no = se.nextInt();

        System.out.print("Enter The Requred Oparator : ");
        char oparator = se.next().charAt(0);
        se.close();
        int result = calculate(first_no,seceond_no,oparator);

        if (oparator == '+' || oparator == '-' || oparator == '*' || oparator == '/'){
            System.out.println(first_no+" "+oparator+" "+seceond_no+" = "+result);
            System.out.println("Thanks for using the Calculator");
        }else {
            System.out.print("Please Enter The Valid oparator !");
        }



    } // -- main

    static int calculate(int x, int y, char oparator){
        int result = 0;
        switch (oparator){
            case '+':
                result = x+y;
                break;
            case '-':
                result = x-y ;
                break;
            case '*':
                result = x*y;
                break;
            case '/':
                result = x/y;
                break;

        } // -- switch
        return result;
    }
}
