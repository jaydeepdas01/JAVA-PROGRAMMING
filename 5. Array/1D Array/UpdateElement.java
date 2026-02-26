import java.util.Scanner;
import java.util.Arrays;

public class UpdateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Enter array element
        System.out.println("Enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Enter index to update value-(Index start for 0.) : ");
        int index = sc.nextInt();

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Enter new value : ");
        int value = sc.nextInt();

        int[] result = update(arr, index, value);

        System.out.println("After updating Array : " + Arrays.toString(result));
        sc.close();

    }

    static int[] update(int[] arr, int index, int value) {

        arr[index] = value;

        return arr;
    }
}
