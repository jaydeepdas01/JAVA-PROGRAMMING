import java.util.*;

public class _1_IterableInterface {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // using enhancef for loop;
        System.out.println("Using for each loop : ");
        // Internally same as iterator
        /*
         * Agar koi class Iterable implement kare:
         * tum uspe for-each loop chala sakte ho
         * tum iterator le sakte ho
         */
        for (int x : list) {
            System.out.println(x);
        }

        //call list.toString() not iterate.
        System.out.println(list);
    }
}