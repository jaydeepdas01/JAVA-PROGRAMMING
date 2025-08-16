import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number ");
        int b = sc.nextInt();
        sc.close();;

        System.out.printf("Befor swap a = %d and b = %d",a,b);

        // now swaping logic using third variable.

        int temp = a;
        a = b;
        b = temp;

        System.out.println();
        System.out.printf("After swap a = %d and b = %d ",a,b);


    }
}