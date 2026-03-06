import java.util.Scanner;

public class VowelCount2 {
    public static void main(String[] args) {
         int count = 0, constant = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String str2 = str.toLowerCase(); // convert string into lower case.

        char[] arr = str2.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }else{
                constant++;
            }
        }

        System.out.println(str + " has " + count + " vowels And Constant : " + constant);
    }
}
