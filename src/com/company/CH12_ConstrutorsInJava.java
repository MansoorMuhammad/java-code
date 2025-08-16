package com.company;

class MyEmployee{
    private int id;
    private String name;

//    // default constructor
//    public MyEmployee(){
//        id = 99;
//        name = "XYZ";
//    }
//     parameterized constructor method 1
    public MyEmployee(int i, String n){
        this.id = i;
        this.name = n;
    }
//    public void setId(int i){
//        this.id = i;
//    }public void setName(String n){
//        this.name = n;
//    }
    public int getId(){
        return id;
    }public String getName(){
        return name;
    }
//    // parameterized constructor method 2
//    public MyEmployee(int i){
//        this.id = i;
//    }public MyEmployee(String n){
//        this.name = n;
//    }


}

public class CH12_ConstrutorsInJava {
    public static void main(String[] args) {
//        MyEmployee object = new MyEmployee(67,"mansoor");
        MyEmployee object = new MyEmployee(89,"Mansoor Muhammad");
//        object.setId();
//        object.setName();
        System.out.println(object.getId());
        System.out.println(object.getName());

    }
}
