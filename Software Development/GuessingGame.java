import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // Step 1: Randomly select a number between 1 and 20
        Random rand = new Random();
        int numberToGuess = rand.nextInt(20) + 1;
        int attempts = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 10.");
        System.out.println("You have " + attempts + " attempts to guess the number.");

        // Step 2: Loop to allow the player to guess
        while (attempts > 0) {
            // Step 3: Get the player's guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            // Step 4: Check if the guess is correct
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // Step 5: Decrement the number of attempts
            attempts--;

            // Step 6: Check if the player has any attempts left
            if (attempts == 0) {
                System.out.println("Sorry, you've run out of attempts. Better luck next time!");
                System.out.println("The correct number was " + numberToGuess + ".");
            } else {
                System.out.println("You have " + attempts + " attempts left.");
            }
        }

        scanner.close();
    }
}
