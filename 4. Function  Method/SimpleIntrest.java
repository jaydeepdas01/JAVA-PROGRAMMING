import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount(p) : " );
    double Principal = sc.nextDouble();

    System.out.print("Enter rate of interest(R) in % : ");
    double rate = sc.nextDouble();

    System.out.print("Enter time(T) in year : ");
    double time = sc.nextDouble();

    double simpleIntrest = simpleIntrest(Principal, rate, time);
    System.out.println("Simple intrest of given data : " + simpleIntrest);

    }


    //function
    static double simpleIntrest(double Principal, double rate, double time){
        return (Principal*rate*time)/100;
    }
}