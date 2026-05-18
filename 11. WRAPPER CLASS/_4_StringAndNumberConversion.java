public class _4_StringAndNumberConversion {
    public static void main(String[] args) {
        // parshXxx() -> converting String input into primitive value.
        System.out.println("String to primitive : ");
        String str1 = "100";
        String str2 = "10.5";
        String str3 = "true";

        // String to Primitive.
        int a = Integer.parseInt(str1);
        double d = Double.parseDouble(str2);
        boolean b = Boolean.parseBoolean(str3);
        System.out.println(a);
        System.out.println(d);
        System.out.println(b);

        // Primitive to String.
        System.out.println("Primitive to String : ");
        int x = 50;
        String s1 = String.valueOf(x);
        System.out.println(s1);
        // also we can
        String s2 = Integer.toString(x);
        System.out.println(s2);

        // String to Wrapper.
        // String to wrapper.
        String s3 = "100";
        String s4 = "1.1";
        String s5 = "true";

        Integer i = Integer.valueOf(s3);
        Double d2 = Double.valueOf(s4);
        Boolean b2 = Boolean.valueOf(s5);
        System.out.println(i);
        System.out.println(d2);
        System.out.println(b2);

        System.out.println("Wrapper to String : ");
        Integer I = 70;
        String st = I.toString();
        String st2 = String.valueOf(I);
        System.out.println(st);
        System.out.println(st2);
        // or

    }
}
