import java.util.Scanner;

public class FiboWithMethod {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        //mehtod call.
        printFibonacci(num);

        sc.close();

    }

//Method for fibonacci algorithm.
static void fiboAlgo(int number){

int temp = 0, a = 0 , b = 1;
System.out.print("0  1  ");
for (int i = 1; i <=number-2; i++) {
    
    temp = a + b;
    a = b;
    b = temp;
System.out.print(temp + "  ");   
}
}

//method for handling edge case.
static void printFibonacci(int number){
if (number==1){
System.out.println(" 0 ");
}else if(number ==2){
System.out.println("0  1 ");
}else if (number<=0){
     System.out.println("Please enter a number greater than 0.");
}else{
    
fiboAlgo(number); // method call
}
}
}

