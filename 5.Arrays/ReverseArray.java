import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] arr = new int[5];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("Before reverse Array: " + Arrays.toString(arr));
        int left = 0, right = arr.length-1,temp;
        while (left<right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("After reverse Array:  " + Arrays.toString(arr));
    }
}
