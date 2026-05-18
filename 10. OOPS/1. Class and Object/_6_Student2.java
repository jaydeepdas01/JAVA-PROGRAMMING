class Student2{

    void show(int id, float marks, String name){
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Marks : " + marks);
        System.out.println();
}
}

public class _6_Student2 {
    public static void main(String[] args) {

        Student2 s1 = new Student2();
        s1.show(1, 89.5f, "Jay");

           Student2 s2 = new Student2();
        s2.show(2, 79.5f, "Deep");

           Student2 s3 = new Student2();
        s3.show(3, 55.5f, "Das");

    }
}
