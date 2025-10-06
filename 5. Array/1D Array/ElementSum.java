
import java.util.Scanner;

public class ElementSum {
    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter java elements : ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the arr[%d] element : ", i);
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of all array elements : " + sum);
    

    }
}