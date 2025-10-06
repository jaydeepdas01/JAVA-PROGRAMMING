public class StaticMethod {
    public static void main(String[] args){

        //there is no need to create object , we can call without class name if method and main belong same class
        int result1 = add(10,10,30);
        System.out.println("Sum1 = " + result1); //10+10+10 = 50

        //for best practices always use className.methodName() to call a static method.
        int result2 = StaticMethod.add(result1, result1, result1); //50+50+50= 150
        System.out.println("Sum2 = " + result2);
    }

    //static method no need to create object of class for calling.
    static int add(int a, int b, int c){

        return (a + b + c);
    }
}
