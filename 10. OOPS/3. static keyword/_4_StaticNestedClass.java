class Outer {
    static int data = 30;

    static class Inner {
        void show() {
            System.out.println("Data from outer : " + data);
        }
    }
}

public class _4_StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
