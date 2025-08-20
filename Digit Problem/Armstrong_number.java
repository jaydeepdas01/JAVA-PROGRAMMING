import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        int count = 0, digit;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();

        int number = num;
        int  originalNumber = number;
        
        while (num > 0) {
            num = num / 10;
            count++;
        }

        while (number > 0) {
            digit = number % 10;
            sum = sum + (int) Math.pow(digit, count);
            number = number / 10;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is a not Armstrong number.");
        }

    }
}
