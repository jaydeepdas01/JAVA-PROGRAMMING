import java.io.*;

public class PrintName {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[5];
        System.out.println("Enter Names : ");
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        System.out.println("Printing Name(Varargs method) : " );
         display(str);
    }

    static void display(String... name){
        for(String i : name){
            System.out.println(i);
        }
    }
}
