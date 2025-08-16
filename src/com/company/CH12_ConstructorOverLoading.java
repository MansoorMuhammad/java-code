package com.company;
class IStudent{
    int id;
    String name;
    float gpa;

    IStudent(int i , String n, float g){
        this.id = i;
        this.name = n;
        this.gpa = g;
    }
    public void display(){
        System.out.println("ID of the student is: " + id);
        System.out.println("Name of the student is: " + name);
        System.out.println("GPA of the student is: " + gpa);
    }
//    IStudent(){
//        id = 46684;
//        name = "Mansoor Muhammad";
//        gpa = 3.13f;
//    }
}
public class CH12_ConstructorOverLoading {
    public static void main(String[] args) {
        IStudent student = new IStudent(123456 , "OOP in Java" , 3.13f);
        System.out.println("id of the student is: " + student.id);
        System.out.println("Name of the student is: " + student.name);
        System.out.println("GPA of the student is: " + student.gpa);

    }
}
