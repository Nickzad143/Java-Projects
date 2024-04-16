import java.util.Scanner;
import java.util.Random;

public class HangmanGame {
    private static final String[] WORDS = {"ahmad", "mahmood", "esmatullah", "nickzad", "hamza","qodus","hakim",
                                           "mateen", "aslam", "nazeer", "basheer", "amina","saber","marjan",
                                           "latifa", "siyar", "sultan", "qasim", "hashim","kabir","hashmatullah",
                                           "manan", "monisa", "latif", "marwa", "hikmatullah", "sadaf", "osman"};

    private static final int MAX_TRIES = 5;
    private static final String[] HANGMAN_DRAWINGS = {
           "  |===|\n" +
        "  |   |\n" +
        "  |   O\n" +
        "  |  /|\\\n" +
        "  |  / \\\n" +
        "  |\n" +
        " /|\\=====",
        "  |===|\n" +
        "  |   |\n" +
        "  |   O\n" +
        "  |  /|\\\n" +
        "  |  /\n" +
        "  |\n" +
        " /|\\=====",
        "  |===|\n" +
        "  |   |\n" +
        "  |   O\n" +
        "  |  /|\\\n" +
        "  |\n" +
        "  |\n" +
        " /|\\=====",
        "  |===|\n" +
        "  |   |\n" +
        "  |   O\n" +
        "  |  /|\n" +
        "  |\n" +
        "  |\n" +
        " /|\\=====",
        "  |===|\n" +
        "  |   |\n" +
        "  |   O\n" +
        "  |   |\n" +
        "  |\n" +
        "  |\n" +
        " /|\\=====",
        "  |===|\n" +
        "  |   |\n" +
        "  |   O\n" +
        "  |\n" +
        "  |\n" +
        "  |\n" +
        " /|\\=====",
        "  |===|\n" +
        "  |   |\n" +
        "  |\n" +
        "  |\n" +
        "  |\n" +
        "  |\n" +
        " /|\\====="
    };

    private static final Random random = new Random();
    private static String secretWord;
    private static char[] guessedLetters;
    private static int triesLeft;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman Game!");
        System.out.println("Try to guess the name within " + MAX_TRIES + " tries.");

        while (true) {
            secretWord = getRandomWord();
            guessedLetters = new char[secretWord.length()];
            triesLeft = MAX_TRIES;

            for (int i = 0; i < guessedLetters.length; i++) {
                guessedLetters[i] = '_';
            }

            while (triesLeft > 0) {
                System.out.println("\n" + HANGMAN_DRAWINGS[MAX_TRIES - triesLeft]);
                displayWord();
                System.out.println("Tries left: " + triesLeft);
                System.out.print("Missed letters: ");
                displayMissedLetters();

                char guess = getGuess(scanner);
                if (!processGuess(guess)) {
                    triesLeft--;
                }

                if (isWordGuessed()) {
                    System.out.println("\nCongratulations! You guessed the name: " + secretWord);
                    break;
                }
            }

            if (triesLeft == 0) {
                System.out.println("\nSorry, you've run out of tries. The name was: " + secretWord);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing Hangman!");
                break;
            }
        }
    }

    private static String getRandomWord() {
        return WORDS[random.nextInt(WORDS.length)];
    }

    private static void displayWord() {
        for (char letter : guessedLetters) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    private static void displayMissedLetters() {
        // Display missed letters
        for (char letter : guessedLetters) {
            if (letter == '_') {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    private static char getGuess(Scanner scanner) {
        char guess;
        while (true) {
            System.out.print("Guess a letter: ");
            String input = scanner.next().toLowerCase();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                guess = input.charAt(0);
                break;
            } else {
                System.out.println("Invalid input. Please enter a single letter.");
            }
        }
        return guess;
    }

    private static boolean processGuess(char guess) {
        boolean isCorrectGuess = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                guessedLetters[i] = guess;
                isCorrectGuess = true;
            }
        }
        return isCorrectGuess;
    }

    private static boolean isWordGuessed() {
        for (char letter : guessedLetters) {
            if (letter == '_') {
                return false;
            }
        }
        return true;
    }
}
