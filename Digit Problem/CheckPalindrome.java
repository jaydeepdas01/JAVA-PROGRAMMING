import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        int digit;
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        int number = num; // store original number.

        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (number == rev) {
            System.out.println(number + " is Palindrome.");
        } else {
            System.out.println(number + " is not palindrome.");
        }
    }

}
