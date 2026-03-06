public class CharArray {
    public static void main(String[] args) {
        String str = "HELLO";
        // converting string into single single character.
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
