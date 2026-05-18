//only number type data can used this class.
class Box<T extends Number> {
    T value;

    // constructor.
    Box(T value) {
        this.value = value;

    }

    T print() {
        return value;
    }
}

public class _7_BoundedGenerics {
    public static void main(String[] args) {
        // Integer
        Box<Integer> box1 = new Box<>(10);
        System.out.println(box1.print());
        // Double
        Box<Double> box2 = new Box<>(10.1);
        System.out.println(box2.print());


        // cant be String.
        // Box<String> box3 = bew Box<>("Hello"); ..... Erroe.


    }
}
