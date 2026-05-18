import java.util.*;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();

        col.add(10);
        col.add(20);
        col.add(30);
        col.add(40);

        // col.clear();
        // System.out.println(col);
        System.out.println(col.isEmpty());

        Iterator<Integer> it = col.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}