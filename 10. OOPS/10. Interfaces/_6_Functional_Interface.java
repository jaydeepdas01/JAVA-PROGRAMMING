/*Functional interface can have only one abstract method not more then one but
it can have multiple default,static or private method */

@FunctionalInterface // we must use this
interface Parent {

    void show(); // only one abstract method can present in this interface.

}

class Son implements Parent {
    @Override
    public void show() {
        System.out.println("son override parent.");
    }
}

public class _6_Functional_Interface {
    public static void main(String[] args) {
        Parent p = new Son();
        p.show();

        // using lambda
        Parent obj = () -> System.out.println("Hello");
        obj.show();
    }
}
