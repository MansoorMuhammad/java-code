package com.company;

public class CH04_LogicalOpertorsInJava {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x = " + x + ", y = " + y);

        // Logical AND (&&)
        System.out.println("x && y: " + (x && y));

        // Logical OR (||)
        System.out.println("x || y: " + (x || y));

        // Logical NOT (!)
        System.out.println("!x: " + (!x));
        System.out.println("!y: " + (!y));

        // Logical AND with both true
        boolean a = true, b = true;
        System.out.println("a && b (true && true): " + (a && b));

        // Logical OR with both false
        boolean m = false, n = false;
        System.out.println("m || n (false || false): " + (m || n));
    }
}
