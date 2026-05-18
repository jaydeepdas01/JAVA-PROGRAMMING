import java.util.Arrays;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id : " + id + " , name : " + name;
    }
}

public class _1_ObjectArray {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Jay");
        Student s2 = new Student(2, "Deep");
        Student s3 = new Student(3, "Das");

        // creating array of Student class
        Student[] students = new Student[3];
        // /assigning object to students arrays
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println("Id : " + students[0].id + ", Name : " + students[0].name);
        System.out.println("Id : " + students[1].id + ", Name : " + students[1].name);
        System.out.println("Id : " + students[2].id + ", Name : " + students[2].name);

    }
}