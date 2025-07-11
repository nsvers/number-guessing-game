// nsver Guessing Game v1.0
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sysNum = (int)(Math.random() * 101);
        int userNum;

        //Starting message
        System.out.println("Welcome to nsver's Guessing Game!\n" +
                            "I have picked a random number. Can you guess it?\n" +
                            "If you don't end up guessing the number on your first try, I'll give you hints until you do.\n" +
                            "Input your guess here: ");
        userNum = input.nextInt();

        while (sysNum != userNum){
            if (sysNum > userNum) {
                System.out.println("Your guess is too low! Try again.");
            }
            if (sysNum < userNum){
                System.out.println("Your guess is too high! Try again.");
            }
            System.out.println("Input your guess here:");
            userNum = input.nextInt();
        }

        System.out.println("Congrats! You won!");
        input.close();
    }

}
