import java.util.*;

public class _8_UnboundedWildCard {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        printList(l1);

        List<String> l2 = Arrays.asList("A", "B", "C");
        printList(l2);
    }

    static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
