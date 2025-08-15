package com.company;
import java.util.Scanner;

public class CH06_SwitchStatement {
    public static void main(String[] args) {

        Scanner forInp = new Scanner(System.in);
//        int day;
//        System.out.printf("Enter name of the day through number: ");
//        day = forInp.nextInt();


//        switch(day) {
//            case 1:
//                System.out.println("Day : Monday");
//                break;
//            case 2:
//                System.out.println("Day : Tuesday");
//                break;
//            case 3:
//                System.out.println("Day : Wednesday");
//                break;
//            case 4:
//                System.out.println("Day :  Thursday");
//                break;
//            case 5:
//                System.out.println("Day : Friday");
//                break;
//            case 6:
//                System.out.println("Day : Saturday");
//                break;
//            case 7:
//                System.out.println("Day : Sunday");
//                break;
//            default:
//                System.out.println("Invalid Option !!!!!!!!!!!!!");
//        }

        //in case of a string
        String name;
        System.out.println("Enter Your Name: ");
        name = forInp.nextLine();

        switch (name) {
            case "OOP in Java" -> System.out.println("It is a 4 c/hr Subject");
            case "Urdu" -> System.out.println("It is a 2 c/hr Subject");
            case "Discrete" -> System.out.println("It is a 3 c/hr subject");
            default -> System.out.println("Invalid Choice !!");
        }
    }
}
