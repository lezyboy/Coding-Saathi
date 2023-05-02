package guessgame;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random()*100)+1;
        int userGuess;
        int num = 0;

        System.out.println("A number is in my mind between 1 and 100. Can you guess what it is?");
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            num++;

            if (userGuess < randomNumber) {
                System.out.println("Your guess is smaller then my number!!. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is higher then my number!!. Try again.");
            } else {            
                System.out.println("Congratulations, you guessed the number in " + num + " guesses!");                   
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}