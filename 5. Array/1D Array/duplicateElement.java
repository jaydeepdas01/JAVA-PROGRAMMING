import java.util.Scanner;

public class duplicateElement {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        boolean isDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element present : " + arr[i]);
                    isDuplicate = true;
                    break;
                }
            }
        }

         if (!isDuplicate) { // flase 
                    System.out.println("There is no any duplicate element.");
                }
    }

}
