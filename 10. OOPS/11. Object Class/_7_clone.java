class Test2 implements Cloneable {
    int id;

    Test2(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Id : " + id;
    }
}

public class _7_clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test2 t1 = new Test2(10);
        System.out.println(t1);

        Test2 t2 = (Test2) t1.clone();
        System.out.println(t2);
    }
}
