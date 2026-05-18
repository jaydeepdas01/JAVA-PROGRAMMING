import java.util.*;

public class _9_LowerBoundedWildcard {
    public static void main(String[] args) {

        List<Number> list = new ArrayList<>();
        addNumbers(list);
        System.out.println(list);

    }

    static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
