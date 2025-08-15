package com.company;
import java.util.Scanner;

public class CH06_CH06_PS_pr1 {
    public static void main(String[] args) {

        Scanner forInp = new Scanner(System.in);
        //problem # 01
//        int  a = 10;
//        if ( a <= 11){
//            System.out.println("I am 11 ");
//        }else {
//            System.out.println("I am not 11");
//        }


        //problem # 02
//        int totalMarks = 100;
//        int passingMarks = 33;
//        System.out.println("Enter marks: ");
//        int a = forInp.nextInt();
//        int b = forInp.nextInt();
//        int c = forInp.nextInt();
//
//        if (a * 100 / totalMarks >= passingMarks){
//            System.out.println("Subject 01 is passed");
//        }else{
//            System.out.println("Subject 01 is failed");
//        }
//        if (b * 100 / totalMarks >= passingMarks){
//            System.out.println("Subject 02 is passed");
//        }else{
//            System.out.println("Subject 02 is failed");
//        }
//        if (c * 100 / totalMarks >= passingMarks){
//            System.out.println("Subject 03 is passed");
//        }else{
//            System.out.println("Subject 03 is failed");
//        }
//        int totalSum = a + b + c;
//        System.out.println("Total Marks is: " + totalSum + " / 300");
//
//        int totalPercentage = totalSum * 100 / 300;
//        System.out.println("Total Percentage is : " + totalPercentage + "%");
//        if(totalPercentage >= 40){
//            System.out.println("CONGRATULATIONS You are passed !");
//        }else{
//            System.out.println("UNFORTUNATELY You are failed !");
//        }

        //problem 03
//        int income;
//        System.out.println("Enter Your Salary: ");
//        income = forInp.nextInt();
//        System.out.println("Your salary is: " + income);
//
//        if(income >=25000 && income <=50000){
//            System.out.println("Tax is 5% and the income of tax is " + income * 5 / 100);
//        } else if (income > 50000 && income <=100000) {
//            System.out.println("Tax is 20% and the amount of tax is " + income * 20 / 100);
//        } else if (income >100000) {
//            System.out.println("Tax is 30% and the amount of tax is: "+ income * 30 / 100);
//        }else{
//            System.out.println("Invalid!");
//        }

        //problem 04
        System.out.println("Enter Number for the day: ");
        int day = forInp.nextInt();

        switch(day){
            case 1:
                System.out.println("Day : Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday ");
                break;
            case 5:
                System.out.println("Day: Friday ");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid Option");
                break;

        }
    }
}
