public class VarargsExample {
    public static void main(String[] args) {

        System.out.println("sum : " + add()); // zero argument.
        System.out.println("sum : " + add(5)); // one argument.
        System.out.println("sum : " + add(5 , 5));// two argument.
        System.out.println("sum : " + add(5 , 5 , 5 , 5)); // multiple argument.
    }

    // varargs method here int... num act as an array.
    static int add(int... num) {
        int result = 0;

        //num here act as array.
        for (int n : num) {
            result += n;
        }
        return result;
    }
}