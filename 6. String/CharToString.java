import java.util.Scanner;
import java.util.Arrays;

public class CharToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Character Array element: ");

        char[] ch = {'J','a','y','d','e','e','p'};
        System.out.println(Arrays.toString(ch));

        String str = "";

        for(int i =0; i<ch.length ; i++){
            str += ch[i];
        } 

        String das = " Das"; // jaydeep + das = jaydeep das (space also add)

        str = str+das;
        System.out.print("After convert into String : " + str);
    }
}
