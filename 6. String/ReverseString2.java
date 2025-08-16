import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        char[] arr  = str.toCharArray();

        int left = 0,right = arr.length-1;

        while(left < right){

            char temp = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reverse = new String(arr);
        System.out.println("Before result : " + str);
        System.out.println("After reverse : " + reverse);
    }
}
