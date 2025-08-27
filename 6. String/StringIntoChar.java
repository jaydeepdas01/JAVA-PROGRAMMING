import java.util.Scanner;
import java.util.Arrays;
public class StringIntoChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String  : " );

        String str = sc.nextLine();
        sc.close();

        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));
        for(int i= 0; i<str.length(); i++){
           System.out.println(ch[i]);
        }





    }
}
