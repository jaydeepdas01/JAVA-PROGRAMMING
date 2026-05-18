class Demo2{
    static{
        System.out.println("first static block");
    }

    static{
        System.out.println("Second static block");
    }

    static{
        System.out.println("Third static block");
    }
}

public class _6_Practices2 {
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        System.out.println("Main");
    }
}
