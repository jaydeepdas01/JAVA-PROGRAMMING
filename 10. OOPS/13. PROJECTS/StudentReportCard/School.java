package StudentReportCard;

public class School {
    Student[] students = new Student[100];
    int count = 0;

    // adding Students;
    void addStudents(Student s) {

        if (count < 100) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Students Storage full.");
        }
    }

    // showing all students
    void showAllStudents() {
        for (int i = 0; i < count; i++) {
            if (students[i] != null) {
                students[i].displayDetails();
            }
        }
    }

    // find student by roll number
    void findStudent(int rollNumber) {
        for (int i = 0; i < count; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                students[i].displayDetails();
                return;
            }
        }
    }

    // show only passed students;
    void showPassedStudents() {
        for (int i = 0; i < count; i++) {
            if (students[i].getResult().equals("PASS")) {
                students[i].displayDetails();
            }
        }
    }
}
