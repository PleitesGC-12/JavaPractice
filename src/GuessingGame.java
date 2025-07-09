import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int userChoice;
        int winnerNumber;
        int attempts = 0;

        winnerNumber = random.nextInt(1,101);
        System.out.print("The winner number is " + winnerNumber);
        System.out.println();

        System.out.println("Enter a number from 1-100");
        userChoice = input.nextInt();

        // This time we are working with a do while version of the code
        do {
            System.out.println("Oops, that's incorrect 😨 ! Try again ");
            attempts ++;
            userChoice = input.nextInt();
        } while (userChoice != winnerNumber);


        System.out.println("🎉Congrats, you've won the game 🎉");
        System.out.println("Total attempts: " + attempts);


    }
}

