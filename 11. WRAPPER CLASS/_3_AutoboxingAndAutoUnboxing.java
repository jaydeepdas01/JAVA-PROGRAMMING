public class _3_AutoboxingAndAutoUnboxing {

    public static void main(String[] args) {
        // manually primitive -> wrapper object
        // Boxing
        int a = 10;
        Integer i = Integer.valueOf(a);
        System.out.println("Manual Boxing : " + i);

        // AutoBoxing
        int b = 20;
        Integer i2 = b;// internally Integer i2 = Integer.valueOf(a);
        System.out.println("AutoBoxing : " + i2);

        // manual UnBoxing;
        Integer obj = Integer.valueOf(100);
        int x = obj.intValue();
        System.out.println("Manual Unboxing : " + x);

        // Auto Unboxing
        Integer obj2 = 200;
        int y = obj2;
        System.out.println("AutoUnboxing : " + y);

    }
}