import java.util.Objects;

class Student2 {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // if equals is override hashcode() must also be override.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Student2))
            return false;

        Student2 s = (Student2) obj; // type cast
        return id == s.id && Objects.equals(name, s.name);

    }

    // equal object -> same hashcode
    // same hashcode -> may equal or may not equal.
    
    //internal working.
    /* int result = 17;
    result = 31 * result + id;
    result = 31 * result + name.hashCode(); */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class _4_hashCode {
    public static void main(String[] args) {
        Student2 s1 = new Student2(1, "Jay");
        Student2 s2 = new Student2(1, "Jay");
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
