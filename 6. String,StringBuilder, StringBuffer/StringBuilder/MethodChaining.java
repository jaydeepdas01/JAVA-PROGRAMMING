public class MethodChaining {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // we can use multiple method.
        sb.append(" java").append(" How are You.").reverse();
        System.out.println(sb);
    }
}
