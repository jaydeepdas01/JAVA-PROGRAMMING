package StudentManagementSystem;

public class StudentManagementSystem {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Jaydeep Das", 55.5f);

        StudentManager manager = new StudentManager();
        manager.addStudent(s1); // all value of the s1 asign to the addStudent.
        manager.showStudents();
        // update marks
        manager.updateMarks(66.7f);
        manager.showStudents();
    }
}