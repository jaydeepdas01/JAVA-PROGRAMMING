public class VariableTypes {

    int a = 10; // Instance variable
    static int c = 30; // Static variable

public static void main(String[] args) {
    int b = 20; // local Variable
    final int D = 40; // final variable, final varibale name always in capital letter.

    VariableTypes obj = new VariableTypes(); // creating object for access instance varible

    System.out.println(obj.a);
    System.out.println(b);
    System.out.println(VariableTypes.c); //Static variable so there is no need to create to objcet
    System.out.println(D);

}
}
