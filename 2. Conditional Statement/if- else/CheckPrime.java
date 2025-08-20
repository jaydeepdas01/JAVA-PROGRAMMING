import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " Prime number.");
        }else{
            System.out.println(num + " Not a prime number.");
        }

    }
}
