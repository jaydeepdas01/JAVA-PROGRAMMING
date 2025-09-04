import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        sc.close();


        boolean isPrime = true;
        if (num <= 1) {
            System.out.println(num + " is a not prime number.");
            return;

        } else {

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                  isPrime = false;
                  break;
                }
            }
        }

        if (!isPrime) {
            System.out.println(num + " is not a prime Number.");
        } else {
            System.out.println(num + " is a prime number.");
        }
    }

}
