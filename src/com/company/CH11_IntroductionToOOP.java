package com.company;
import java.util.Scanner;
class Employee{
    int id;
    String name;
    int salary;

public void DisplayAll(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter ID of the Employee: ");
    id = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter Name of the Employee: ");
    name = scanner.nextLine();

    System.out.println("Enter salary of the Employee: ");
    salary = scanner.nextInt();

    System.out.println("ID of the Employee is: " + id);
    System.out.println("Name of the Employee is: " + name);
    System.out.println("Salary of the Employee is: " + salary);

    System.out.println();
    System.out.println();

}

}
public class CH11_IntroductionToOOP {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.DisplayAll();

        Employee employee1 = new Employee();
        employee.DisplayAll();

    }
}
