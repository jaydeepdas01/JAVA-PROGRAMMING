import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();
        // edge case
        if (num <= 1) {
            System.out.println("No divisor greater than 1 exists.");
            return;
        }
        int minDivisor =num;
        for (int i = 2; i *i<= num; i++) {
            if (num % i == 0) {
               minDivisor = i;
                break;
            }
        }
         System.out.printf("Minimum divisor(greater than 1) of %d : %d", num, minDivisor);

    

    }
}
