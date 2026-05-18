
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // List<String> list1 = Arrays.asList("a", "b");
        // printArray(list1);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        printArray(list2);

    }

    static void printArray(List<? extends Number> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}