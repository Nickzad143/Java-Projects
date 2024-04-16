import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int guessCount = 0;
            int guess;
            boolean guessedCorrectly = false;

            System.out.println(" Welcome to the Guessing Game!");
            System.out.println(" I have picked a random number between 1-100. Try to guess it! ");

            while (!guessedCorrectly) {
                System.out.print(" Enter your guess : ");
                guess = scanner.nextInt();
                guessCount++;

                if (guess < numberToGuess) {
                    System.out.println(" The number is greater than your guess. ");
                } else if (guess > numberToGuess) {
                    System.out.println(" The number is less than your guess.");
                } else {
                    System.out.println(" Congratulations! You've guessed the number correctly in " + guessCount + " guesses! ");
                    guessedCorrectly = true;
                }
            }
            int points = 100 - (guessCount - 1) * 10;
            if (points < 0) {
                points = 0;
            }
            System.out.println("You earned " + points + " points.");

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            if (!playChoice.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing! Goodbye!");
            }
        }
        scanner.close();
    }
}
