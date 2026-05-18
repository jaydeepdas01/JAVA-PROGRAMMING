import java.util.*;

public class _1_WithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(); // if not provide type.

        list.add(10);
        list.add("Hello");// allow that's the (problem)
        list.add(10.5);

        System.out.println(list);

        //Manual casting require else error.
        String s = (String)list.get(1);
        System.out.println(s);

    }
}