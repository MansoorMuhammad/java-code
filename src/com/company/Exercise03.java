package com.company;

import java.util.Scanner;
import java.util.Random;

class Game {
    private int randomNumber;
    private int noOfGuesses;

    // Constructor to generate the random number between 1 and 100
    public Game() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1; // random number between 1 and 100
        noOfGuesses = 0;
    }

    // Method to take input from the user
    public int takesInput() {
        System.out.print("Enter your guess (1-100): ");
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        noOfGuesses++;
        return userGuess;
    }

    // Method to check if the guessed number is correct
    public boolean isCorrectNumber(int userGuess) {
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct number.");
            System.out.println("Number of guesses you took: " + noOfGuesses);
            return true;
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }
        return false;
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        /*
         create a class game which allows a user to play  "Guess the Number " game once.
         Game should have the following methods:
         1. Constructor to generate the random number;
         2. takesInput() of a number
         3. isCorrectNumber() to detect the number entered by the user is true
         Properties:
         1. noOfGuesses (int) etc
         */

        Game game = new Game();
        boolean isCorrect = false;

        // User plays once; you can allow more guesses if you want by looping
        while (!isCorrect) {
            int userGuess = game.takesInput();
            isCorrect = game.isCorrectNumber(userGuess);
        }

    }
}
