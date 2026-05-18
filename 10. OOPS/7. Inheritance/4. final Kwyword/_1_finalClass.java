final class Parent{
int a = 10;
String name = "parent";
}

class Child extends Parent{ // final class cannot be inherited.

}

public class _1_finalClass {

    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.a);

        // child extends final class so it can not acess final class.
        // showing error during execution.
        Child c1 = new Child();
        System.out.println(c1.a);
    }
}