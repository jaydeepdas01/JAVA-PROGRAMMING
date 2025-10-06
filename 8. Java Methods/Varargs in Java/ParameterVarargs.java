public class ParameterVarargs {
    public static void main(String[] args) {
        System.out.println(add(1, 4)); //zero varargs possible
        System.out.println(add(1, 1, 1, 1, 1));
        System.out.println(add(10, 10, 10, 10, 10));
    }

    // one method only have one Varargs parameter and alwways placr at the end
    // you can add zero one or multiple parameter.
    static int add(int a, int b, int... num) {
        int result = a + b;

        for (int i : num) {
            result = result + i;
        }
        return result;
    }
}
