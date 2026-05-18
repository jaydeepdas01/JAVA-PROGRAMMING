public class _6_WrapperCaching {

    public static void main(String[] args) {
        // integer cached range -128 to 127

        // a and b both point same reference
        Integer a = 100;
        Integer b = 100;

        System.out.println(a == b); // true because both point same reference ; -128 to 127

        Integer x = 200;
        Integer y = 200;
        // flase because not in caches range so new object is created. diffrent
        // reference.
        System.out.println(x == y);

        // we use equals() to compare object not the referece.
        System.out.println(x.equals(y)); // ture. because both values are same;
    }
}