import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        input.close();

      num =   Math.abs(num); //-ve to +ve
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }

        }

        System.out.println("The number of digit in given input : " + count);
    }
}
