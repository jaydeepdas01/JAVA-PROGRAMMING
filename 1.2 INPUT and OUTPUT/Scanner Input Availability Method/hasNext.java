import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");

        if (sc.hasNext()) { //even return true if you enter interger beacuse if convert input into string.
            String str = sc.next();
            System.out.println("String : " + str);
        }else{
            System.out.println("Input is not any String.");
        }
    }
}
