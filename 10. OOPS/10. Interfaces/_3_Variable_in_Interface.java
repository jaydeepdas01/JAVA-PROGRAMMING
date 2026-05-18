interface Shape {
    void Square();

    int area = 25; // internally it is public static final int area = 25;
    // initialize karna mandatory hai
    /*
     * public int area = 25;
     * public static int area = 23;
     * public final int area =25
     * final int area = 25
     * keise bhi likhu ye internally public static final int hi rhega..
     */
}

class Formula implements Shape {
    @Override
    public void Square() {
        System.out.println("Shquare");
    }
}

public class _3_Variable_in_Interface {
    public static void main(String[] args) {
        // static so we can call directly using Interface name.
        System.out.println(Shape.area);

        // Shape.area = 13;
        // we can't change value because it is final.

        Shape s = new Formula();
        s.Square();

    }
}
