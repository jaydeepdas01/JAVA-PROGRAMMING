import java.util.Scanner;

public class WeekName{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter week number between 1 to 7.");
        int num = input.nextInt();

        switch(num){

            case 1:
            System.out.println("It's Monday.");
            break;

            case 2:
            System.out.println("It's Tuesday.");
            break;
            
            case 3:
            System.out.println("It's Wednesday.");
            break;

            case 4:
            System.out.println("It's Thursday.");
            break;

            case 5:
            System.out.println("It's Friday.");
            break;

            case 6:
            System.out.println("It's Saturday.");
            break;

            case 7:
            System.out.println("It's Sunday.");
            break;

            default :
            System.out.println("Please enter between 1 to 7.");
            break;
        }



        //Method 2 

        System.out.println("Print thorugh another methods.1");
        switch(num){
            case 1 -> System.out.println("It's Monday.");
            case 2 -> System.out.println("It's Tuesdat.");
            case 3 -> System.out.println("It's wednesday.");
            case 4 -> System.out.println("It's Thursday.");
            case 5 -> System.out.println("Friday.");
            case 6 -> System.out.println("It's Saturday.");
            case 7 -> System.out.println("It's Sunday.");
            default -> System.out.println("Please enter between 1 to 7.");

        }

    }
}