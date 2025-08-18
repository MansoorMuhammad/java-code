package com.company;

class SuperClass {
    private String name;
    private int value;

    // Constructor
    public SuperClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    // method1 with parameter
    void method1(String msg) {
        System.out.println("I am the first method of the superClass. Message: " + msg);
    }

    // method2 with parameter
    void method2(int number) {
        System.out.println("I am the second method of the superClass. Number: " + number);
    }
}

class SubClass extends SuperClass {
    private String extra;

    // Constructor calls super() for superclass fields
    public SubClass(String name, int value, String extra) {
        super(name, value);
        this.extra = extra;
    }

    // Getter and setter for extra
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }

    // Overrides method2
    @Override
    void method2(int number) {
        System.out.println("I am the overridden second method of the subClass. Number: " + number);
    }

    // New method3 with parameter
    void method3(double data) {
        System.out.println("I am the third method of the subClass. Data: " + data);
    }
}

public class CH13_dynamicMethodDispatchInJava {
    public static void main(String[] args) {

        SuperClass obj = new SuperClass("Super", 10);
        obj.method1("Hello from SuperClass");  // SuperClass method1
        obj.method2(100);                       // SuperClass method2

        obj = new SubClass("Sub", 20, "Extra Info");
        obj.method1("Hello from SubClass");    // Inherited method1 from SuperClass
        obj.method2(200);                       // Overridden method2 in SubClass

        // To call method3 (which is only in SubClass), we must cast:
        if (obj instanceof SubClass) {
            ((SubClass) obj).method3(123.45);
        }

    }
}
