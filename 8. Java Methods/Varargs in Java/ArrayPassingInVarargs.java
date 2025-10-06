public class ArrayPassingInVarargs {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        // Varargs Internally act as an array so we can pass an array in varargs.
        System.out.println(add(arr));
    }

    static int add(int... num) {

        int result = 0;
        for (int i : num) {
            result += i;
        }

        return result;
    }
}
