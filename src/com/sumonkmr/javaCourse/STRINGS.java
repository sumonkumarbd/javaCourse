package com.sumonkmr.javaCourse;

import java.util.Locale;

public class STRINGS {
    public static void main(String[] args) {
        String name = "Sumon";
       // System.out.printf("My nam is %s",name);

        // --Strings All methods

        // -- toLowerCase method
       /* String lname = name.toLowerCase(Locale.ROOT);
        System.out.println(lname); */

        // --toUpperCase method
        String uname = name.toUpperCase(Locale.ROOT);
        System.out.println(uname);
    }
}
