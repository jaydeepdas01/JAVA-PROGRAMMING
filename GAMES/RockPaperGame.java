import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Ask user to choose Rock, Paper or Scissor
        System.out.print("Choose Rock, Paper & Scissor : ");
        String choose = sc.next();

        // Convert user input to lowercase to make it case-insensitive
        choose = choose.toLowerCase();

        // Variable to store machine's choice
        String machine = "";

        // Generate a random number from 1 to 3
        int n = rand.nextInt(3) + 1;

        // Assign machine's choice based on random number
        switch (n) {
            case 1 -> machine = "rock";
            case 2 -> machine = "paper";
            case 3 -> machine = "scissor";
        }

        // Show both choices
        System.out.println("You choose : " + choose);
        System.out.println("Machine choose : " + machine);

        // Check if user input is valid (rock, paper or scissor)
        if (choose.equals("rock") ||
                choose.equals("paper") ||
                choose.equals("scissor")) {

            // If both choices are same → It's a tie
            if (choose.equals(machine)) {
                System.out.println("Tie! Both chose same : " + choose);

            // Conditions where user wins
            } else if ((choose.equals("rock") && machine.equals("scissor")) ||
                    (choose.equals("scissor") && machine.equals("paper")) ||
                    (choose.equals("paper") && machine.equals("rock"))) {

                System.out.println("You Win!!");

            // If it's not tie and not user win → Machine wins
            } else {
                System.out.println("Machine Win!!");
            }

        } else {
            // If user input is not rock/paper/scissor
            System.out.println("You choose wrong input !!");
        }

    }
}
