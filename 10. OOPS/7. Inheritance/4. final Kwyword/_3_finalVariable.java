class Age{
    final int age = 10;
}


public class _3_finalVariable {
    public static void main(String[] args) {
        Age child = new Age();
        System.out.println(child.age); // print 10.

        child.age = 20; // showing error cause age is a final variable and final variable
        // can not be change.
        System.out.println(child.age);
    }
}
