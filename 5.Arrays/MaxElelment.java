import java.util.Scanner;

public class MaxElelment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxElelment;

        int[] arr = new int[5];

        System.out.println("Enter array elements : ");
        // for each loop;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // first assign one element is big then compare with other element
        maxElelment = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                maxElelment = arr[i];
            }
        }

        System.out.println("Maximum element in array : " + maxElelment);
        sc.close();
    }
}
