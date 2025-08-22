import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrderSort {
    public static void main(String[] args) {

        int temp;
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter Array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.print("Array Element : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("\nAfter sorting : " + Arrays.toString(arr));

    }
}