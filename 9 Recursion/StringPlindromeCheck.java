import java.util.Scanner;

public class StringPlindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        String word = sc.next();
        int length = word.length();
        String reverse = "";

        //reverse string method call.
      String result =   reverseString(word, length, reverse);
      System.out.println(result);

      //check palindrome.
      checkPalindrome(word, result);
  

    }

    //reverse string recursive method.
    static String reverseString (String str, int length,String result){

        if(length == 0){
            return result;
        }
        result = result + str.charAt(length-1);
       return reverseString(str, length-1,result);

    }

    static void checkPalindrome(String orignal , String reverse){
        if (orignal.equals(reverse)) {
            System.out.println("String is Palindrome.");
        }else{
            System.out.println("String is not Palindrome.");
        }
    }
}
