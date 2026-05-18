public class addDesh {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("banana");

        for (int i = 0; i < sb.length() - 1; i+=2) {
            sb.insert(i+1, "*");
        }

        System.out.println(sb);
    }
}
