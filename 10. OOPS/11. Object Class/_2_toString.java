class Student {

    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // override to string based on personal requirement.
    @Override
    public String toString() {
        return "Student Name : " + name + ", id : " + id;
    }
}

public class _2_toString {
    public static void main(String[] args) {

        Student s1 = new Student("Jaydeep Das", 1);
        System.out.println(s1.toString()); // now it call overriden to string.

        // Object class reference = child class Object
        Object obj = new Student("Dass jii", 2); // overriden toString()
        System.out.println(obj); // internally obj.toString();

        Object o = new Object();
        System.out.println(o.toString());// object class toString not overriden.
    }
}
