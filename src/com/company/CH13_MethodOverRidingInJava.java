package com.company;

// Parent class
class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class CH13_MethodOverRidingInJava {
    public static void main(String[] args) {

        Animals animal = new Animals();
        animal.sound();  // Calls Animal's sound()

        Dogs dog = new Dogs();
        dog.sound();  // Calls overridden sound() in Dog
        dog.bark();

    }
}
