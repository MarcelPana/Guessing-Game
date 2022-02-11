import com.sun.org.apache.xpath.internal.objects.XBooleanStatic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {

    static Scanner sc = new Scanner(System.in);
    static boolean keepPlaying = true;


    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {
            playARound();
        }
        System.out.println("\nThank you for playing!");

    }

    public static void playARound() {
        boolean validInput = false;
        int number, guess = 0;
        String answer;
// Pick a random number
        number = (int) (Math.random() * 10) + 1;
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
// Get the guess
        System.out.print("What do you think it is? ");

        do {
            try {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.print("I said, between 1 " + "and 10. Try again: ");
                    validInput = false;
                }
            } catch (Exception e) {
                System.out.println("Sorry! Just numbers, please!");
                System.out.println("Please try again!");
                validInput = true;
            }
        } while (!validInput);

// Check the guess

        if (guess != number) {
            System.out.println("You're wrong! " + "The number was " + number);
        } else {
            System.out.println("You're right!" + "The number was " + number);
        }
// Play again?
        do {
            System.out.print("\nPlay again? (Y or N)");
            answer = sc.next();
            validInput = true;
            if (answer.equalsIgnoreCase("Y")) {
            } else if (answer.equalsIgnoreCase("N"))
                keepPlaying = false;
            else
                validInput = false;
        } while (!validInput);
        System.out.println("\nThank you for playing!");


    }
}