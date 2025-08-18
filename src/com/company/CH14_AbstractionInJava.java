package com.company;

abstract class FirstClass{
    // constructor
    FirstClass(){
        System.out.println("I am the constructor of the First Class");
    }public void sayHello(){
        System.out.println( " = Wellcome to the First Class");
    }
    abstract public void greet();
    abstract public void greet2();

}
class SecondClass extends FirstClass{
    @Override
     public void greet(){
         System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good After-Noon");
    }
}
class ThirdClass extends SecondClass{

    ThirdClass(){
        System.out.println("I am the Third Class Constructor");
    }
    @Override
    public  void greet2(){
        System.out.println("Good Night");
    }
}

public class CH14_AbstractionInJava {
    public static void main(String[] args) {

        //object
//        FirstClass first = new FirstClass();
//        first.sayHello();
        SecondClass second = new SecondClass();
        second.sayHello();
        second.greet();
        second.greet2();

        System.out.println();

        ThirdClass third = new ThirdClass();

        third.greet2();


    }
}
