package com.company;
// Parent class
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;  // 'this' refers to current class instance variable
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

// Child class inheriting Animal
class Dog extends Animal {
    String name;

    // Constructor uses super() to call parent constructor
    Dog(String animalName, String dogName) {
        super(animalName);  // Calls constructor of Animal class
        this.name = dogName;  // 'this' refers to Dog's own instance variable
    }

    // Overriding sound method and using super to call parent method
    @Override
    void sound() {
        super.sound();  // call parent method
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println("Dog's name: " + this.name);
        System.out.println("Animal's name (from super): " + super.name);
    }
}

public class CH13_ThisAndSuperInJava {
    public static void main(String[] args) {

        Dog dog = new Dog("Generic Animal", "Buddy");

        dog.sound();    // Calls overridden method
        dog.display();  // Display names in child and parent

    }
}
