import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius :");
        celsius = sc.nextFloat();

        float fahrenheit = celsius *(9f/5f)+32;//formula
        System.out.printf("%f in fahrenheit : %f \n",celsius,fahrenheit );

        System.out.print("Enter fehrenheit : ");
        float fahrenheit2 = sc.nextFloat();

        float celsius2 = (fahrenheit2 - 32) * 5f / 9f; //formula
 System.out.printf("%f in fahrenheit : %f ",fahrenheit ,celsius2);


    }
}
