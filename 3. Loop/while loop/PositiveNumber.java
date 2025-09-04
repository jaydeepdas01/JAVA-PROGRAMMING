import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {                       // infinite loop
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            
            if (num < 0) {                   // exit condition
                break;
            }
            
            System.out.println("Entered number is positive so loop run again.");
            count++;                         // counting positive inputs
        }

        System.out.println("Loop runs " + count + " time.");
    }
}
