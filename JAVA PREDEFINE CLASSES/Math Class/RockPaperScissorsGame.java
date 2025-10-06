/*Rules:

->Rock vs Scissors → Rock wins (Rock crushes Scissors)
->Scissors vs Paper → Scissors wins (Scissors cut Paper)
->Paper vs Rock → Paper wins (Paper covers Rock)
->Same choice → Tie */

import java.io.*;

public class RockPaperScissorsGame {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose Rock,Paper or Scissors : ");
        String choose = br.readLine();
        choose = choose.toLowerCase();

        int num = (int) (Math.random() * 3) + 1;

        System.out.println("You choose : " + choose);
        System.out.println("Machine choose : ");

        switch (num) {
            case 1 -> System.out.println("Rock");
            case 2 -> System.out.println("Paper");
            case 3 -> System.out.println("Scissors");
        }

        if (choose.equals("rock") && num == 1) {
            System.out.println("Tie (rock vs rock)");

        } else if (choose.equals("paper") && num == 2) {
            System.out.println("Tie (paper vs paper)");

        } else if (choose.equals("scissors") && num == 3) {
            System.out.println("Tie (scissors vs scissors)");

        } else if (choose.equals("rock") && num == 3) {
            System.out.println("Rock wins (Rock crushes Scissors)");

        } else if (choose.equals("paper") && num == 1) {
            System.out.println("Paper wins (Paper covers Rock)");

        } else if (choose.equals("scissors") && num == 2) {
            System.out.println("Scissors wins (Scissors cut Paper)");

        //  Lose cases add kiye
        } else if (choose.equals("rock") && num == 2) {
            System.out.println("Paper wins (Paper covers Rock) - You lose!");

        } else if (choose.equals("paper") && num == 3) {
            System.out.println("Scissors wins (Scissors cut Paper) - You lose!");

        } else if (choose.equals("scissors") && num == 1) {
            System.out.println("Rock wins (Rock crushes Scissors) - You lose!");

        } else {
            System.out.println("Wrong Input.");
        }
    }
}
