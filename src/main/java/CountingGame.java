import java.util.Random;
import java.util.Scanner;

public class CountingGame {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        // number of attempts per round
        int noOfAttempts = 4;

        // number of rounds, set to 0 to start off.
        int noOfRounds = 3;

        // win counts for player and comp
        int playerWinCount = 0;
        int computerWinCount = 0;

        System.out.println("A number between 1 and 50 has been chosen.");

        System.out.println("You have " + noOfAttempts + " attempts to guess the correct number.");

        for (int i = 0; i < noOfRounds; i++) {

            //reset guessedCorrect after every loop?
            boolean guessedCorrect = false;

            // Obtain a number between 1 and 50. We want it to reset each round
            int number = random.nextInt(50) + 1;
            System.out.println(number);

            System.out.println("Round " + (i+1));
            for (int j = 0; j < noOfAttempts; j++) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == number) {
                    System.out.println("You win! You guessed the correct number!");
                    guessedCorrect = true;
                    playerWinCount += 1;
                    System.out.println("player win count: " + playerWinCount);
                    System.out.println("computer win count: " + computerWinCount);
                    break;
                } else if (guess < number) {
                    System.out.println("The number is greater than " + guess);
                } else {
                    System.out.println("The number is less than " + guess);
                }
            }

            // If guessedCorrect is still false after 4 attempts
            if (!guessedCorrect) {
                System.out.println(
                        "You are out of attempts. The correct number was: " + number);
                computerWinCount += 1;
                System.out.println("player win count: " + playerWinCount);
                System.out.println("computer win count: " + computerWinCount);
            }
        }

        // This needs to be outside the while loop?
        scanner.close();
    }
}
