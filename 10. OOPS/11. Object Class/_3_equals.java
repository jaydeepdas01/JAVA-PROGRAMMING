
import java.util.Objects;;

class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // same reference eg s2 = s1; s1.equals(s2) like conditosz
            return true;

        if (obj == null)
            return false; // null check;

        // check if obj is not an instance of Student1 (or its subclass)
        //Same class or inherited na ho tb false;
        if (!(obj instanceof Student1))
            return false;

        Student1 s = (Student1) obj; // type cast.
        return age == s.age && Objects.equals(name, s.name);
    }

}


public class _3_equals {
    public static void main(String[] args) {
        Student1 s1 = new Student1("jay", 23);
        Student1 s2 = new Student1("jay", 23);

        System.out.println(s1.equals(s2));

    }
}
