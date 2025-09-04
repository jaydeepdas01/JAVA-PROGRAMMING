import java.util.Scanner;

public class count_Digit {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        sc.close();
    // if input is -ve then change into +ve for counting the digits.
        if (num < 0) {
            num = -num;
        }
        //store origianl value
        int number = num; 

        for (; num > 0; num = num / 10) {
            count++;
        }
        if (number == 0) {
            System.out.println("The digits in given num  : 1");
        } else {
            System.out.println("The digits in given num  : " + count);
        }
    }

}
