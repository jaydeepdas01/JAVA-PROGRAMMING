public class Strings {
  public static void main(String[] args){
    String s1 = "Java";
    String s2 = "Java";
    
    String s3 = new String("Java");

    System.out.println(s1 == s2);
    System.out.println(s1 == s3);

    s1.concat(" Hello"); // not change
    System.out.println(s1);

    String concate = s1.concat(" Hello"); // original value not change new object created 
    System.out.println(concate);


    System.out.println(s1.equals(s3));
  } 
}
