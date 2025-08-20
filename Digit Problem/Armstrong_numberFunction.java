import java.util.Scanner;

public class Armstrong_numberFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();

        int result = checkArmstrong(num);
        if (num == result) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is a not Armstrong number.");
        }

    }

    static int checkArmstrong(int num) {
        int count = 0, digit;
        int sum = 0;
        int Number = num;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        while (Number > 0) {
            digit = Number % 10;
            sum = sum + (int) Math.pow(digit, count);
            Number = Number / 10;
        }
        return sum;

    }
}
