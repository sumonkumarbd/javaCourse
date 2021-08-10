package com.sumonkmr.javaCourse;

import java.util.Scanner;

public class EXAM_PARSENTAGE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks out of 100 please...");

        System.out.print("What is your ENGLISH marks? : ");
        float english = sc.nextFloat();

        System.out.print("What is your MATH marks? : ");
        float math = sc.nextFloat();

        System.out.print("What is your BANGLA marks? : ");
        float bangla = sc.nextFloat();

        System.out.print("What is your SINCE marks? : ");
        float since = sc.nextFloat();

        float total = english + math + bangla + since ;
        float totalParsentage = total / 4 ;



        if (english > 100 || math > 100  || bangla > 100 || since > 100  ) {
            System.out.println("This is invalid!! Please give your correct marks.");
        }else {
            System.out.println("You're get "+totalParsentage+ "% marks in the exam.");

        }

    }
}
