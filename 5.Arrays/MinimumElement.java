import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minElelment;

        int[] arr = new int[5];

        System.out.println("Enter array elements : ");
        // for each loop;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // first assign one element is big then compare with other element
        minElelment = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                minElelment = arr[i];
            }
        }

        System.out.println("Maximum element in array : " +minElelment);
        sc.close();
}
}
