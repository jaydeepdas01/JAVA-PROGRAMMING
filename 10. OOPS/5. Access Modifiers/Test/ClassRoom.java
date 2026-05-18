package Test;
import Test.Student;

public class ClassRoom {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 10;
        s1.name = "Rohan";
        s1.std = 7;

        s1.showDate();

        int add = Student.add(10, 20);
        System.out.println(add);
    }
}
