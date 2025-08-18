import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to Search : ");
        int num = sc.nextInt();
        sc.close();

        boolean notPresent = true;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(num + " is present in the array.");
                notPresent = false;
                break;
            }
        }

        if (notPresent) {
            System.out.println(num + " is not present in the array.");
        }

    }
}
