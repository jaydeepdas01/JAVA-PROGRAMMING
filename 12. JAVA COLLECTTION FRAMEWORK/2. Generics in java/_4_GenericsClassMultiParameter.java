class Pair<K, V> {
    // both can be diffrent type parameter;
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void show() {
        System.out.println(key + " -> " + value);
    }
}

public class _4_GenericsClassMultiParameter {
    public static void main(String[] args) {

        // Both can diffrent;
        Pair<Integer, String> p1 = new Pair<>(1, "Apple");
        p1.show();

        Pair<String, Integer> p2 = new Pair<>("Age", 23);
        p2.show();

        // can be same type parameter
        Pair<Integer, Integer> p3 = new Pair<>(1, 10);
        p3.show();

        Pair<String, String> p4 = new Pair<>("One", "Ten");
        p4.show();

    }
}
