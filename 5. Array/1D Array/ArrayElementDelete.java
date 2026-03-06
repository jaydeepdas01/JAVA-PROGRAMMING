import java.util.Scanner;
import java.util.Arrays;

public class ArrayElementDelete {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        enterElement(arr, sc);
        DeleteElement(arr, sc);

    }

    static void enterElement(int[] arr, Scanner sc) {
        System.out.println("Enter Array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.err.println("Before Deleting : " + Arrays.toString(arr));
    }

    static void DeleteElement(int[] arr, Scanner sc) {
        System.out.println("Enter delete Element : ");
        int num = sc.nextInt();

        int newSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newSize++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                 if(i+1<arr.length){
                    arr[i] = arr[i+1];
                }
                    // arr[i+1] = arr[i+2];
                }
            }
            System.out.println("After deleting : " + Arrays.toString(Arrays.copyOf(arr, newSize)));
        } 
    }
