import java.util.Scanner;

public class VowelCount{
    public static void main(String[] args){

        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') {
                count++;
            }
        }

        System.out.println("The number of Vowel in given string is : " + count);
        
    }

}