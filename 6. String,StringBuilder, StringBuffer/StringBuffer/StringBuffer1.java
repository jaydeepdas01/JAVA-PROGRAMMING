public class StringBuffer1{
    public static void main(String[] args){
        // same as StringBuilder but with thread safety.
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        
        System.out.println(sb.capacity());
    }
}