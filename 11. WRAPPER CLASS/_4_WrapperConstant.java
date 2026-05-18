public class _4_WrapperConstant {
    public static void main(String[] args) {

        int max = Integer.MAX_VALUE;
        System.out.println(max);

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        int intSize = Integer.SIZE;
        // int size = 4byte , 1byte = 8 bit , so 4 byte = 32 bit.
        System.out.println(intSize);
        // long size 8 bytes , so ,in bits its 64 bits.
        System.out.println(Long.SIZE);

        // RETURN CLASS OBJECT OF PRIMITIVE TYPE.
        System.out.println(Integer.TYPE);
        System.out.println(Character.TYPE);

        // Additional Important constants
        double d = Double.POSITIVE_INFINITY;
        System.out.println(d);

        float f = Float.NEGATIVE_INFINITY;
        System.out.println(f);

        // NaN(Not a Number);
        System.out.println(Double.NaN);

        boolean b = Boolean.TRUE;
        boolean b2 = Boolean.FALSE;
        System.out.println(b + "  " + b2);

    }
}