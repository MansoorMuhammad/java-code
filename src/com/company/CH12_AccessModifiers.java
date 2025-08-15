package com.company;

class Employee1{
    private int id;
    private String name;
    private int Salary;

    // priavte = getters & setters
    // getter = datatype
    // setter = void

    //for id
    public int getId(){
        return id;
    }public void setId(int i){
        this.id = i;
    }
    // for name
    public String getName(){
        return name;
    }public void setName(String n){
        this.name = n;
    }
    // for salary
    public int getSalary(){
        return Salary;
    }public void setSalary(int s){
        this.Salary = s;
    }
}

public class CH12_AccessModifiers {
    public static void main(String[] args) {
        // making od an object
        Employee1 object = new Employee1();
        // declaring parameters
        object.setId(78);
        object.setName("Mansoor Muhammad");
        object.setSalary(56000);
        // output of the program
        System.out.println("ID of the Employee is: " + object.getId());
        System.out.println("Name of the Employee is: " + object.getName());
        System.out.println("Salary of the Employee is: " + object.getSalary());

    }
}
