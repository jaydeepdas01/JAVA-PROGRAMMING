import java.util.Scanner;

public class Practices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Word : ");
        String str = sc.next();
        char ch;

        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            ch = str.charAt(i);
            result += ch;
        }
        System.out.println("After Reverse : " + result);
        checkPalindrome(str, result);
    }

static void checkPalindrome(String str, String result){
    if (str.equals(result)) {
        System.out.println("Palindrome.");
    }else{
        System.out.println("Not Palindrome.");
    }

    static void CheckVowel(String word){
        int count1 =0, count2 = 0;
        char ch;
        word = word.toLowerCase();
        for(int i = 0 ; i<word.length(); i++){
            ch = word.charAt(i);

            if (ch =='a' || ch =='e'||ch =='i' ||ch =='o' ||ch =='u') {
            count1++;
            }else{
            count2++;
            }
        }
        System.out.println("Total vowel :" + count1);
        System.out.println("Total conconent : "+ count2); 
    }
}

}
