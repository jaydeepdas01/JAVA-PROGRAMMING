import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int fact = factorial(num);
        System.out.println("Factorial of " + num + " : "+ fact);
    }

    //recursive method for factorial. 
    static int factorial(int n){
        if(n == 0 ){
            return 1;
        }
        
        return n * factorial(n-1);
    }
}