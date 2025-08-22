import java.util.Scanner;
import java.util.Arrays;

public class DescendingOrderSort {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array element : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

         System.out.println("After Sorting : " + Arrays.toString(arr));

    }
}
