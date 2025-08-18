package com.company;

class Person {
private String name;
private int age;

// Constructor
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

// Getter and Setter for name
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

// Getter and Setter for age
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
}

// Child class inheriting Person
class Student extends Person {
    private int studentId;

    // Constructor
    public Student(String name, int age, int studentId) {
        super(name, age);    // call parent class constructor
        this.studentId = studentId;
    }

    // Getter and Setter for studentId
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

public class CH13_InheritanceINJava {
    public static void main(String[] args) {

        Student s = new Student("Alice", 20, 101);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Student ID: " + s.getStudentId());

        // Using setters
        s.setName("Bob");
        s.setAge(21);
        s.setStudentId(102);

        System.out.println("\nAfter updating details:");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Student ID: " + s.getStudentId());

    }
}
