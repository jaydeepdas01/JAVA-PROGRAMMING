public class _2_BoxingAndUnboxing {
    public static void main(String[] args) {
        // coverting primitive to wrapper object manually.
        int a = 10;
        Integer obj = new Integer(a); // manually., and not recommended.
        System.out.println(obj);

        // prefred version on manual.
        Integer obj2 = Integer.valueOf(a); // rarely use because automatically done by java compiler
        System.out.println(obj2);

        // manually Unboxing, wrapper to primitive
        Integer i = Integer.valueOf(100);
        int x = i.intValue();
        System.out.println(x);

        // also
        Integer j = new Integer(100);
        int y = j.intValue();
        System.out.println(y);


        

    }
}
