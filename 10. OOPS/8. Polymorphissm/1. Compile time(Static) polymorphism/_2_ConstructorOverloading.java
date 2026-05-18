class Sum {

    // same constructor name with diffrent parameter.
    Sum() {
        System.out.println("Hello I am sum.");
    }

    // constructor 2
    Sum(int a, int b) {
        System.out.println(a + b);
    }

    // constructor 2.
    Sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class _2_ConstructorOverloading {

    public static void main(String[] args) {

        //Compiler know which constructor to called based on parameter passed.
        Sum s1 = new Sum();
        Sum s2 = new Sum(10, 20);
        Sum s3 = new Sum(10, 20, 20);
    }
}
