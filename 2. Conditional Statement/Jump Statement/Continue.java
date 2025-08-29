import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println("Even numbers from 0 to " + num  + ":");
        for (int i = 0; i <= num; i++) {
            // If the number is odd, skip this iteration and move to the next one
            if (i % 2 != 0) { 
                continue; 
            }
            System.out.print(i + " ");
        }
    }
}
