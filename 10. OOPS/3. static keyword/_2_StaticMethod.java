class Calculator{
    //addition
   static int add(int a, int b){
    return a+b;
   }
// subtraction
   static int sub(int a, int b){
    return a-b;
   }
//multiplication
   static int mul(int a , int b){
    return a*b;
   }
    
}

public class _2_StaticMethod {
    public static void main(String[] args) {
        //no need to create object of the class because of static ,use classname
        System.out.println("2+2 : " + Calculator.add(2,2));
        System.out.println("2-2 : " + Calculator.sub(2,2));
        System.out.println("2*2 : " + Calculator.mul(2,2));
    }
}
