//Creating generic class
class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class _3_GenericsClass {
    public static void main(String[] args) {
        // creating generic class objec
        // Integer type
        Box<Integer> obj = new Box<>();
        obj.setValue(10);
        System.out.println(obj.getValue());

        // String type box
        Box<String> obj2 = new Box<>();
        obj2.setValue("Hello");
        System.out.println(obj2.getValue());

        // for Double type
        Box<Double> obj3 = new Box<>();

        obj3.setValue(10.10);
        System.out.println(obj3.getValue());

    }
}
