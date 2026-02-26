import java.util.Arrays;
import java.util.Scanner;

public class DeletionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //user input for deleted key
        System.out.print("Enter element to delete: ");
        int key = sc.nextInt();
        int[] result = deletion(arr, key);

        System.out.print("Before deletion : " + Arrays.toString(arr));
        System.out.print("\nAfter deletion : " + Arrays.toString(result));

        sc.close();

    }

    static int[] deletion(int[] arr, int key) {
        int size = 0;

        // count array size after deleting element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                size++;
            }
        }

        // new arrry for store element after deleting element
        int[] arr2 = new int[size];

        // copy array
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr2[index++] = arr[i];
            }
        }

        return arr2;

    }
}
