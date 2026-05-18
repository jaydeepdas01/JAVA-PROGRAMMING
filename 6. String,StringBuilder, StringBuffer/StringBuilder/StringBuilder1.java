public class StringBuilder1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

       String str = " World"; 
        StringBuilder sb2 = new StringBuilder(str);
        
        sb.append(sb2);
        System.out.println(sb);

        // capacity
        // default capacity
        StringBuilder sb3 = new StringBuilder();
        System.out.println("Default Capacity : " + sb3.capacity());

        //capacity with String Length
        StringBuilder sb5 = new StringBuilder("Hello"); // 16 +5 = 21.
        System.out.println(sb5.capacity());

        //custom capacity
        StringBuilder sb6 = new StringBuilder(50);
        System.out.println(sb6.capacity());
    

    }
}