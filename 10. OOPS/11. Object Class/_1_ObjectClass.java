class A extends Object {// internallya automaticlly already present

}

class B { // internally java consider class B extends Object{ }
    // this is called implicit inheritance

}

public class _1_ObjectClass {

    public static void main(String[] args) {

        // parent reference = child object.
        Object obj = new B();// Object class is parent class of all class
        System.out.println(obj.getClass());

    }
}
