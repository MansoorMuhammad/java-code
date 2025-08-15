package com.company;
import java.util.Scanner;
public class CH_08PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // practice problem 01


     /*   float [] marks = {87.9f,67.4f,89.0f,87.9f,98.99f};
        float sum = 0;
        //for each loop
        for (float element: marks){
            sum+=element;
        }
        System.out.println("The value of sum is: "+sum);
*/
        //practice problem 02


        float [] marks = {87.9f,67.4f,89.0f,87.9f,98.99f};
        System.out.println("Enter a Number: ");
        float num = sc.nextFloat();
        // true or false
        boolean isAnArray = false;
        for (float element : marks){
            if(num == element){
                isAnArray=true;
                break;
            }
        }
        if(isAnArray){
            System.out.println("The Value is Present");
        }else{
            System.out.println("The Value is not present");
        }

        //practice problem 03
    }
}
