public class _5_Utilitymethod {
    public static void main(String[] args) {
        // compareTo()
        // 0 -> if both equal,+ve if first>second, -Ve if first<second

        Integer a = 1;
        Integer b = 2;
        Integer c = 1;
        System.out.println("Both equal : " + a.compareTo(c));
        System.out.println("when first > second : " + b.compareTo(1));
        System.out.println("When second > first : " + a.compareTo(b));

        // equals();
        System.out.println("Diffrent Value : " + a.equals(b));
        System.out.println("Same value : " + a.equals(c));

        // toString();
        Integer obj = 1000;
        String str = obj.toString();
        System.out.println(str);
        System.out.println(str.length());
    }
}
