public class _5_GenericMethod {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        printArray(arr);

        String[] str = { "Apple", "Banana", "Mango" };
        printArray(str);

        Integer i = 100;
        String s = "Jaydeep";

        System.out.println(printValue(100));
        System.out.println(printValue(s));
    }

    // no type.
    static <T> void printArray(T[] arr) {

        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // return type
    static <T> T printValue(T value) { // jeisa data type lena hai weisa value return krna hai isliye T
        return value;
    }
}
