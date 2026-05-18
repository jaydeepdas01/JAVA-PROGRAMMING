package StudentManagementSystem;

public class StudentManager {
    Student[] students = new Student[100];
    int count = 0;

    // add Students
    void addStudents(Student s) {
        students[count] = s;
        count++;
    }

    // show all student
    void showAllStudent() {
        for (int i = 0; i < count; i++) {
            if (students[i] != null) {
                System.out.println("Roll Number : " + students[i].rNo +
                        ", Name: " + students[i].name +
                        ", Marks: " + students[i].marks);

            }
        }
    }

    // update marks by roll number
    void updateMarks(int rollNumber, double newMarks) {
        for (int i = 0; i < count; i++) {
            if (students[i].rNo == rollNumber) {
                students[i].marks = newMarks;
                return;
            }
        }

        System.out.println("Student not found !!!");

    }

    // serach by rNo
    void searchStudent(int rollNumber) {
        for (int i = 0; i < count; i++) {

            if (students[i].rNo == rollNumber) {

                System.out.println("Found -> Roll Number : " + students[i].rNo +
                        ", Name: " + students[i].name +
                        ", Marks: " + students[i].marks);

                return;
            }
        }
        System.out.println("Student not Found!!!!");
    }
}
