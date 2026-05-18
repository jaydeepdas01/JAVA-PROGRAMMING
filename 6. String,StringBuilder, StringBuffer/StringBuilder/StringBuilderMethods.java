public class StringBuilderMethods {
    public static void main(String[] args) {

        // apend()
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);

        //insert();
        sb.insert(5," java");
        System.out.println(sb);

        //replace();
        sb.replace(6, 10, "new");
        System.out.println(sb);

        //delete();
        sb.delete(6, 10);
        System.out.println(sb);
        //deleteCharAt();
        sb.deleteCharAt(0);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Tony");

        //reverse()
        sb2.reverse();
        System.out.println(sb2);

        //setCharAt()
        sb2.setCharAt(2,'n');
        System.out.println(sb2);

        //charAT()
        System.out.println(sb2.charAt(1));

        //subString();
        System.out.println( sb2.subSequence(0, 2));

        String str = sb.toString();
        System.out.println(str);

        //ensureCapacity()
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        //tirmToSize()
        sb.trimToSize();
        System.out.println(sb.capacity());
  

        //setLength()
        sb.setLength(5);
        System.out.println(sb);
    }
}
