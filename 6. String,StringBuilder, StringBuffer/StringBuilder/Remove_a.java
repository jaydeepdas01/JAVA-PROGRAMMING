public class Remove_a {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("banana");
        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == 'a') {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);

     
    }

}
     

