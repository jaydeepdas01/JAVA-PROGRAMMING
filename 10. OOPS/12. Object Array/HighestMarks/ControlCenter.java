package HighestMarks;

public class ControlCenter {
    Student[] students = new Student[100];
    int count = 0;

    // adding student
    void addStudent(Student s) {
        students[count] = s;
        count++;
    }

    // method for printinng highest marks
    void showTopper() {

        if (count == 0) {
            System.out.println("No students found");
            return;
        }

        Student highest = students[0];
        for (int i = 1; i < count; i++) {
            if (highest.marks < students[i].marks) {
                highest = students[i];
            }
        }

        System.out.println("Topper -> ID : " + highest.id +
                ", Name : " + highest.name +
                ", Marks : " + highest.marks);
    }
}
