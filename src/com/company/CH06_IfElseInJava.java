package com.company;
import java.util.Scanner;

public class CH06_IfElseInJava {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in) ;
            // 1.tax calculator

//        System.out.println("enter your age :");
//        int age = sc.nextInt();
//        if (age == 18){
//            System.out.println("You can drive");
//        } else if (age > 18) {
//            System.out.println("You can drive");
//        } else {
//            System.out.println("You cannot drive");
////        }
//        System.out.println("Enter Your Salary: ");
//        int salary = sc.nextInt();
//        if (salary == 0){
//            System.out.println("Salary must be greater than 0 ! ");
//            }
//        else if (salary > 20000 && salary <= 35000) {
//            System.out.println("Tax is 5% and the amount of tax is: " + salary * 5 / 100);
//        } else if (salary > 35000 && salary <=50000) {
//            System.out.println("Tax is 10% and the amount of tax is: " + salary * 10 / 100);
//        }
//        else if(salary>50000){
//            System.out.println("Tax is 20% and the amount of tax is: " + salary * 20 / 100);
//        }
            System.out.print("Enter a Name: ");
            String namePerson = sc.nextLine();
            if (namePerson.equals("Mansoor Muhammad")) {
                System.out.println("He is a good boy");
            }
    }
}
