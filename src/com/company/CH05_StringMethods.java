package com.company;
import java.util.Scanner;

public class CH05_StringMethods {
    public static void main(String[] args) {
        //        String name = "           Mansoor Muhammad FUUAST ";
//        int value = name.length();
//        String lower = name.toLowerCase();
//        String upper = name.toUpperCase();
        String nonTrim = "     Mansoor Muhammad FUUASTIAN ";
        String forTrim = nonTrim.trim();
//        System.out.println("NUmber of letters are: " + value);
//        System.out.println("To Lower Case: " + lower);
//        System.out.println(upper);
        System.out.println("Non-trim Value: " + nonTrim);
        System.out.println("Trim value : " + forTrim);
    }
}
