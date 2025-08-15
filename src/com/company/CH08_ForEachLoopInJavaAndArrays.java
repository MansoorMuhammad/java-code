package com.company;
import java.util.Scanner;
public class CH08_ForEachLoopInJavaAndArrays {
    public static void main(String[] args) {
        Scanner forInp = new Scanner(System.in);
//        int [] marks = {78,56,78,88,89 };
//        //printing the array using for loop
//        for (int i=0; i< marks.length; i++){
//            System.out.println("Value of index "+ i + " is: "+ marks[i]);
//        }
//        //printing the array in reverse order using for loop
//        System.out.println("*******Reverse order*******");
//        for (int j=marks.length-1; j>=0; j=j-1){ //4 3 2 1 0
//            System.out.println("Value of index "+ j + " is: "+ marks[j]);
//        }

        // data from the user

//        int[] marks = new int[4];
//
//        // Input marks for 10 students
//        System.out.println("Enter marks of 10 students:");
//
//        for (int i = 0; i < 4; i++) {
//            System.out.print("Enter marks for student " + (i + 1) + ": ");
//            marks[i] = forInp.nextInt();
//            continue;
//        }
//
//        // Display the entered marks
//        System.out.println("\nMarks of the 10 students:");
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Student " + (i + 1) + ": " + marks[i]);
//            continue;
//        }
//
//        forInp.close();
        // use of for-each loop in java programming
        int [] marks={92,87,78,56,43};
        for(int element: marks){
            System.out.println("Values are: " + element);
        }

    }
}
