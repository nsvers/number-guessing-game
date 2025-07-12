// nsver Guessing Game v1.1
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {

        //initialises scanner & random system number and userNum variable
        Scanner input = new Scanner(System.in);
        int sysNum = (int)(Math.random() * 101);
        int userNum;

        //Starting message
        System.out.println("Welcome to nsver's Guessing Game!\n" +
                "I have picked a random number between 1 and 100. Can you guess it?\n" +
                "If you don't end up guessing the number on your first try, I'll give you hints until you do.");

        // do while loop that prompts user input at least once, breaks out of loop when they get it right
        do{
            System.out.println("Input your guess here: ");
            userNum = input.nextInt();

            // mutually exclusive else if just for fun I don't know
            if (sysNum > userNum) {
                System.out.println("Your guess is too low! Try again.");
            }
            else if (sysNum < userNum) {
                System.out.println("Your guess is too high! Try again.");
            }

        } while (sysNum != userNum);

        // yippeee user won
        System.out.printf("Congrats! You won! The number was %d.", sysNum);
        input.close();
    }

}
