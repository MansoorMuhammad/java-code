package com.company;
import java.util.Scanner; // module in python


public class CH03_InputFromTheUser {
    public static void main(String[] args) {
        int Mis;
        String name;
        Byte sem;
        char Section;
        float gpa;

        // making object of the Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MIS Id of the Student: ");
        Mis = scanner.nextInt();
        scanner.nextLine(); // cin.ignore(); in .cpp
        System.out.println("Enter name of the Student: ");
        name = scanner.nextLine();
        System.out.println("Enter Semester of the Student: ");
        sem = scanner.nextByte();
        System.out.println("Enter Section of the student: ");
        Section = scanner.next().charAt(0);
        System.out.println("Enter gpa of the Student: ");
        gpa = scanner.nextFloat();

        System.out.println("MIS of the Student is: " + Mis);
        System.out.println("Name of the Student is: " + name);
        System.out.println("Semester of the Student is: " + sem);
        System.out.println("Section of the Student is: " + Section);
        System.out.println("GPA of the Student is: " + gpa);


    }
}
