class A{

    String str;
    int i;
    byte b;
    float f;
    double d;
    boolean bo;
    char ch;


}

public class _4_DefaultValue {
    public static void main(String[] args) {
        
        A obj = new A();

        System.out.println("Default Value : ");
        System.out.println("String : " + obj.str);
        System.out.println("int : " + obj.i);
        System.out.println("byte : " +obj.b);
        System.out.println("float : " +obj.f);
        System.out.println("double : " +obj.d);
        System.out.println("boolean : " +obj.bo);
        System.out.println("char : " +(int)obj.ch); // \u0000 not visible that's why typecast
    }
  
}
