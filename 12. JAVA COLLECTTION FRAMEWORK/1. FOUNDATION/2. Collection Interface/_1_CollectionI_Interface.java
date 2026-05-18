
//root interface of all collection. define basic operation to work with group of object.
import java.util.*;

public class _1_CollectionI_Interface {

    public static void main(String[] args) {
        // Collection col = new Collection() we can't do this because it a interface.
        Collection<String> col = new ArrayList<>();

        // add element
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("D");
        col.add("E");
        col.add("F");
        col.add("G");
        System.out.println(col.add("H")); // return true because internall boolean add(E e)

        // check size
        System.out.println("Col size : " + col.size());// 8

        // printing all
        System.out.println(col);

        // Remove element from list
        col.remove("A");
        System.out.println("After move element col size : " + col.size());
        System.out.println(col);

        // check empty();
        System.out.println("is Empty : " + col.isEmpty()); // flase because it has value

        // search check specific element present or not
        System.out.println("col contains B : " + col.contains("B"));

        // remove all element:
        col.clear();
        System.out.println(col);

        // chcek empty or not
        System.out.println("now col is empty : " + col.isEmpty());
    }
}