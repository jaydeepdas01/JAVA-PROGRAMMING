import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkEvenOdd(num);
    }

    static void checkEvenOdd(int num){
        if (num%2==0 ) {
            System.out.println(num + " is a even number");
        }else{
            System.out.println(num + " is a odd number");
        }
    }
}
