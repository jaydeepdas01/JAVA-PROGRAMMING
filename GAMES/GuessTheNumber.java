import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        // Scanner user input lene ke liye
        Scanner sc = new Scanner(System.in);
        // Random number generate karne ke liye
        Random rand = new Random();

        System.out.println("Welcome to Guess The Number Game!");
        System.out.println("Choose difficulty level: 50, 100, or 500");

        // user se difficulty level lena
        int select = sc.nextInt();

        // Validation: agar user galat input de to default 100 hoga
        if (select != 50 && select != 100 && select != 500) {
            System.out.println("Invalid choice! Defaulting to 100.");
            select = 100;
        }

        // Random number generate karega (1 se select tak)
        int randomNum = rand.nextInt(select) + 1;

        // total attempts count karne ke liye
        int attempts = 0;

        System.out.println("I have chosen a number between 1 and " + select + ". Try to guess it!");

        // infinite loop jab tak correct guess na ho
        boolean isTrue = true;
        while (isTrue) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            // checking conditions
            if (guess == randomNum) {
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                isTrue = false; // loop se bahar
            } else if (guess < randomNum) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close(); // Scanner close karna best practice hai
    }
}
