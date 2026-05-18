
class Test {
    @Override
    protected void finalize() {
        System.out.println("Finalize Called.");
    }
}

public class _6_finalize {
    public static void main(String[] args) {

        Test t1 = new Test();

        // java has Garbage collector , automatically remove unused objects from memorty
        // before removing it may call finalize();
        t1 = null;
        System.gc();// request GC.
    }
}
