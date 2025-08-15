package com.company;
import java.util.Scanner;
public class CH09_MethodsInJava {

    // method 01
    // using static in the method just to restrict object
//    static int mySum(int a, int b){
//        int c = a+b;
//        return c;

    //method 2
    // just using data type for teh purpsoe of creating object in the main function
//    int mySum(int x,int y){
//        int z = x + y * 5 / 5;
//        return z;
//    }
    //program 03
    int mySum(int x, int y) {
        int z = x * y;
        return z;
    }


    public static void main(String[] args) {
        Scanner forInp = new Scanner(System.in);
        // method 1
        //without object

//        int x=5,y=7;
//       int c =mySum(x,y);
//        System.out.println("Sum is: " + c);

        //method 2
        // creating object for method
//        CH09_MethodsInJava obj = new CH09_MethodsInJava();
//        int a = 15;
//        int b=15;
//        int c;
//        c=obj.mySum(a,b);
//        System.out.println("Sum is: " + c);

        //another program
        CH09_MethodsInJava obj2 = new CH09_MethodsInJava();
        System.out.print("Enter two numbers to multiply: ");
        int a  = forInp.nextInt();
        int b = forInp.nextInt();;
        int c = obj2.mySum(a,b);
        System.out.println("multiplication os the method is: " + c);

    }
}
