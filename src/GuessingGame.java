import java.util.Random; // To generate random numbers
import java.util.Scanner; // To ask the user for input
public class GuessingGame {
    public static void main (String[] args) {

        Random random = new Random();// Creation of Random object called random
        Scanner input = new Scanner(System.in); // Creation of a Scanner called input

        // Variables needed
        int userChoice;
        int winnerNumber;
        int attempts = 0;

        // The winner number is generated randomly
        winnerNumber = random.nextInt(1,101);

        /* If we want to test it we can include this lines
        System.out.print("The winner number is " + winnerNumber);
        System.out.println(); */
        System.out.println("*********************************************");
        System.out.println(" 🤔 Welcome to the number guessing Game ❓");
        System.out.println("*********************************************");
        // This time we are working with a do while version of the code
        do {
            System.out.println("Enter a number from 1-100, if you guess it you win: ");
            userChoice = input.nextInt();
            System.out.println("-----------------------------------------------------");
            // Giving hints to the user
            if (userChoice < winnerNumber) {
                System.out.println("TOO LOW!! Try again");
                System.out.println("-----------------------------------------------------");
            } else if (userChoice > winnerNumber) {
                System.out.println("TOO HIGH!! Try again");
                System.out.println("-----------------------------------------------------");
            }

            attempts ++;
        } while (userChoice != winnerNumber);

        input.close();

        System.out.println("You just guessed the number, you won 🎉🎉");
        System.out.println("Total attempts: " + attempts);


    }
}

