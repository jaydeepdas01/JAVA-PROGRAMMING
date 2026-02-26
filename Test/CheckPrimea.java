import java.util.Scanner;

public class CheckPrimea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();

        
        if(number < 1){
            System.out.println(number+ " is not a prime number.");
            return;
        }
        
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    static boolean isPrime(int num) {
        boolean isture = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isture = false;
            }
        }

        return isture;
    }
}