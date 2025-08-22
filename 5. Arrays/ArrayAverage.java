
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {

        double avg ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter Array elements : ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the arr[%d] element : ", i);
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        avg = (double)sum/size;

        System.out.println("Average of all array elements : " + avg);
    

    }
} 
