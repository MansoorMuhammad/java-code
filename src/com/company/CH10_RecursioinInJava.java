package com.company;
import java.util.Scanner;
public class CH10_RecursioinInJava {
    public static void main(String[] args) {
        Scanner forInput = new Scanner(System.in);
        System.out.printf("Enter a Number to Find its Factorial: ");
        int n = forInput.nextInt();
//        int n = 3;
        System.out.println("Factorial of the number " + n + " is: " + factorial(n));
        System.out.println("Factorial through iterative method of the number " + n + " is: " + factorialItrative(n));
    }
    //Quiz for finding factorial of a number using recursion method in java
    // finding a factorial of a number using recursion method in java
    // factorial(5) = 5*4*3*2*1 = 120
    //  factorial(n) = n * (n-1);

    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorialItrative(int n) {
        int product = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
//                for (int i = n; i >= 1; i--) {
                product *= i;
            }
        }
        return product;
//        }
    }
}
