package com.company;

public class CH09_VariableArgs {
    public static void main(String[] args) {

        System.out.println("Today is tehe day for passing variable arguments using overloading method");
//        System.out.println("The value at null is: "+ sum()); // this line will not execute bcx there is no argument for a , which is compulsory
        System.out.println("The Sum of 1 is: "+sum(1));
        System.out.println("The Sum of 1 2 & 3 is: "+sum(1, 2, 3));
        System.out.println("The Sum of 1 2 3 & 4 is: "+sum(1, 2, 3, 4));
        System.out.println("The Sum of 1 2 3 4 & 5 is: "+sum(1, 2, 3, 4, 5));
    }

    // using variable arguments
    public static int sum(int a, int...numbers){ // here a is compulsory
        int result = a;
        for(int elements : numbers){
            result = result + elements;
        }
        return result;
    }

//    public static int sum(int a, int b, int c){
//        return a + b + c;
//    }
//    public static int sum(int a, int b, int c, int d){
//        return a + b + c + d;
//    }
//    public static int sum(int a, int b, int c, int d, int e) {
//        return a + b + c + d + e;
//    }
}
