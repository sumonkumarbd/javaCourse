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
        /*String uname = name.toUpperCase(Locale.ROOT);
        System.out.println(uname);*/

        // -- String.lenth method
        // --System.out.println(name.length());

        // -- string,trim methode
         /* String nonTrimmedString = "      Sumon        ";
        System.out.printf("This is nonTrimmedString : %s %n", nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.printf("This is TrimmedString : %s", trimmedString);*/

        // -- string.replace method
        System.out.printf("This is Old string is : %s %n",name);
        String repName = name.replace("mon","mir");
        System.out.printf("After appling replace method : %S",repName);
    }
}
