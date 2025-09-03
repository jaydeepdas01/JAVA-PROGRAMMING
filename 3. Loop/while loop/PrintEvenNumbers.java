import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print all even numbers from 1 to n.");

        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        int i = 0;

        while (i <= num) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
