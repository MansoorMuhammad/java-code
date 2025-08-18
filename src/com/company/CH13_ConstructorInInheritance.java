package com.company;

class Car {
    private String model;
    private int year;
    private String color;

    // Constructor to initialize fields
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Method to display car info
    public void displayCarInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}

public class CH13_ConstructorInInheritance {

    public static void main(String[] args) {


                // Create Car object using constructor
                Car car1 = new Car("Toyota Camry", 2022, "Blue");

                // Display car info
                car1.displayCarInfo();

                // Update color using setter
                car1.setColor("Red");

                System.out.println("After color update:");
                car1.displayCarInfo();


    }
}
