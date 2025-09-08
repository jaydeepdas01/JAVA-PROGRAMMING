import java.util.Scanner;
public class hasNextDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Float : ");
        if (sc.hasNextDouble()) {
            double num = sc.nextDouble();
            System.out.printf("Result : %.2f",num);
        }else{
            System.out.println("Yout entered worng input plest enter double : ");
        }
   
    }
}
