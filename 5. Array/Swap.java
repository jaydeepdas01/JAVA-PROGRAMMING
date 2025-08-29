import java.util.Scanner;

public class Swap {
    public static void main(String[] args){

          int[] arr = new int[3];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        arr[0] = sc.nextInt();
        System.out.print("Enter the value of b: ");
        arr[1] = sc.nextInt();
        sc.close();

        System.out.format("Before swap a = %d and b = %d" , arr[0],arr[1]);
          swap(arr);
          System.out.format("\nAfter swap a = %d and b = %d" , arr[0],arr[1]);

       

    }

    // arr[] and num [] both point same address thats why value change 
    static void swap(int[] num){
         int temp = num[0];
         num[0] = num[1];
         num[1] = temp;

    }
}
