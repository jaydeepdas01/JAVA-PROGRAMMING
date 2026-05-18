public class _1_ListOfWrapperClass {
    public static void main(String[] args) {

        Byte b = 1;
        Short sh = 10;
        Integer i = 100;
        Long l = 1000l;
        Float f = 2.22f;
        Double d = 2.222;
        Character ch = 'A';
        Boolean is = true;

        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(is);

        // Wrapper Object can hold Null
        Integer obj = null;
        System.out.println(obj);

    }
}