
public class _5_getClass {
    public static void main(String[] args) {
        // we can accesss in same package
        Student s1 = new Student("Jaydee", 1);
        System.out.println(s1.getClass()); // return class className;

        // parent reference but run time class is Student1
        Object s2 = new Student1("Deep", 2);
        System.out.println(s2.getClass()); // from student1

        System.out.println(s1.getClass().getName()); // only print the class name;
        System.out.println(s2.getClass().getSimpleName());// print name of the class.

        // return true every class internally inherit Object class.
        System.out.println(s1 instanceof Object);
    }
}
