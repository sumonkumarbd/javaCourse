package com.sumonkmr.javaCourse;

import java.util.Locale;

public class Strings {
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
       /* System.out.printf("This is Old string is : %s %n",name);
        String repName = name.replace("mon","mir");
        System.out.printf("After appling replace method : %S",repName);*/

        // -- String.subatring , method
        /*String subName = name.substring(2);
        String sub2Name = name.substring(1,3);
        System.out.printf("This is an example of substring method. We are pass 2 as value of %s so Its Show from 3rd charecter. %s %n",name,subName);
        System.out.printf("This is an example of substring method. We are pass 1 and 3 as value of %s so Its Show from 2nd and 4rd charecter. %s",name,sub2Name);*/

        // -- String.StartWith method
        /*boolean startWithName = name.startsWith("Su");
        boolean endWithName = name.endsWith("on");
        System.out.printf("Here we given the value Su , Its Chack value from the start of %s and the result is: %s %n",name,startWithName);
        System.out.printf("Here we given the value on , Its Chack value from the end of %s and the result is: %s",name,endWithName);*/

        // -- String.charat method
        /*char cName = name.charAt(2);
        System.out.printf("It's take 3rd char of the %s , because we are pass 2. And the result is : %s",name,cName);*/

        // -- IndexOf method
        /*int inName = name.indexOf("m");
        System.out.printf("It's apply for showing what is the index of the %s , so we are pass m. And the result is : %d %n",name,inName);

        // -last index of string
        int linName = name.lastIndexOf("u");
        System.out.printf("It's apply for showing what is the index of the %s from revarse, so we are pass u. And the result is : %d ",name,linName);*/

        // -- String.equal method
        boolean eqName = name.equals("Sumon");
        boolean eqNameIgnorCase = name.equalsIgnoreCase("suMon");
        System.out.printf("If the given value is match to %s , then we are see here a boolean value .So in that case the result is : %b %n",name,eqName);
        System.out.printf("If the given value is match to %s and also Igonoring the case of characters. Then we are see here a boolean value .So in that case the result is : %b %n",name,eqNameIgnorCase);
    }
}
