class Sum{

    int num1,num2;
    int add(){ //method can use instance variable.
        return num1+num2;
    }


    int add2(int a, int b){ //method with parameter.
        return a+b;
    }
}

public class _2_Method_in_Class {
    public static void main(String[] args){

        Sum obj = new Sum(); // creating object of sum class.

        obj.num1 = 10;
        obj.num2 = 20;
        int add1 = obj.add(); //method that use instance variable .
        System.out.println(add1);

        int add2 = obj.add2(2, 3); // method of sum class with parameter.
        System.out.println(add2);



    }
}
