class Demo{
    static int count;

    static{
        count = 100;
        System.out.println("Staitc block 1");
    }

    static{
        count += 50;
        System.out.println("Static block 2");
    }
}

public class _3_StaticBlock1 {
    public static void main(String[] args) {
        System.out.println("count : " + Demo.count);
       
    }
}
