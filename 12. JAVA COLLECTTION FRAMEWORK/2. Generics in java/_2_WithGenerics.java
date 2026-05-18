import java.util.*;

public class _2_WithGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // now this list only can store integer value;
        list.add(10); // allow
        list.add(20);

        // list.add("Hello"); -> not allow

        ArrayList<String> list2 = new ArrayList<>();
        // only string can store.
        list2.add("Hello");
        list2.add("Hy");
        list2.add("World");
        // list2.add(2); -> not allow.

        // now no need to manual casting
        String s = list2.get(2);
        System.out.println(s);
    }
}

// compile time safety
// no casting
// clean code
