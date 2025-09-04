import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {

        int count = 0, num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number.");
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("You Entered -ve number that's why program stop.");
                break;
            }
            System.out.println("Loop continue beacause you entered +ve number.");
            count++;

        } while (true);

System.out.println("Loop runs "+ count + " time.");
    }
}