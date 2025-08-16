import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long num = sc.nextLong();

        if(num > 0){
            System.out.print("Given number is Positive.");

        }else if(num < 0){
            System.out.print("Given number is negative.");
        }else{
            System.out.println("Given number is zero");
        }
    }
}
