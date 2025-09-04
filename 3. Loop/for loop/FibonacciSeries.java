import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int temp = 0, a = 0, b = 1; // Initializing first two Fibonacci numbers and temp variable
        System.out.print("Enter Number : ");
        int num = sc.nextInt(); 

        // Handling edge cases
        if (num <= 0) {
           
            System.out.println("Please enter a number greater than 0.");
        } else if (num == 1) {
            // If user wants only first term
            System.out.println(a);
        } else if (num == 2) {
            // If user wants first two terms
            System.out.print(a + "  " + b);
        } else {
            // For num >= 3 → print first two numbers and use loop for remaining
            System.out.print(a + "  " + b + "  ");

            // Loop runs for remaining (num - 2) terms
            for (int i = 1; i <= num - 2; i++) {
                temp = a + b; // Next number = sum of previous two numbers
                a = b; // Shift 'a' to 'b'
                b = temp; // Shift 'b' to next number
                System.out.print(temp + "  "); // Print next Fibonacci number
            }
        }

        sc.close(); 
    }
}


/*
Fibonacci Series:
1. It is a sequence of numbers where each number is the sum of the previous two numbers.
2. The series starts with 0 and 1.
3. Mathematically: F(n) = F(n-1) + F(n-2)
4. Example: 0, 1, 1, 2, 3, 5, 8, 13, ...
5. Commonly used in mathematics, computer algorithms, and nature patterns.
*/
