import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, digit;

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        sc.close();

        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of all digit : " + sum);
    }
}