package com.company;
interface sampleInterface{
    void method1();
    void method2();
}
interface childSampleInterface extends sampleInterface{
    void method3();
    void method4();
}
class childSampleClass implements childSampleInterface{
    public void method1(){
        System.out.println("I am the method 1");
    }public void method2(){
        System.out.println("I am the method 2");
    }public void method3(){
        System.out.println("I am the method 3");
    }public void method4(){
        System.out.println("I am the method 4");
    }

}

public class CH14_InheritanceInInterfaces {
    public static void main(String[] args) {
        childSampleClass sample = new childSampleClass();

        sample.method1();
        sample.method2();
        sample.method3();
        sample.method4();
    }
}
