package com.company;
import java.util.Scanner;
public class CH04_ArthimaticOperatorsInJava {
    public static void main(String[] args) {
        // Arthimstic Operators : + , - , / , * , % , ++ , --
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        System.out.print("Enter the First Number: ");
        a= sc.nextFloat();
        System.out.print("Enter the Second Number: ");
        b = sc.nextFloat();

        float sum = a+b;
        System.out.println("Sum is: " + sum);

        float sub = a-b;
        System.out.println("Subtraction is: " + sub);

        float mult = a * b;
        System.out.println("Multiplicatioin is: " + mult);

        float divide = a / b;
        System.out.println("Division is: " + divide);

        float reminder = a % b;
        System.out.println("Subtraction is: " + reminder);

        float increment  = a += b;
        System.out.println("Increment is: " + increment);
    }

}
