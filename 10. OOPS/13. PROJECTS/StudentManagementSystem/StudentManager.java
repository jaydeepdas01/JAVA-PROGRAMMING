package StudentManagementSystem;

public class StudentManager {

    Student student;

    void addStudent(Student s) {
        this.student = s;
    }

    // update marks
    void updateMarks(float marks) {
        student.marks = marks;
    }

    // print student details
    void showStudents() {
        System.out.println("Id : " + student.id + ", Name : " + student.name + ", Marks : " + student.marks);
    
    }
}
