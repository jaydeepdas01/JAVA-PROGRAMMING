package HighestMarks;

public class Main {
    public static void main(String[] args) {
        ControlCenter edit = new ControlCenter();
        edit.addStudent(new Student(1, "Jaydeep Das", 55.7f));
        edit.addStudent(new Student(2, "Gaurav Pratap", 54.5f));
        edit.addStudent(new Student(3, "Shekhar Das", 66.7f));
        edit.addStudent(new Student(4, "Rahul Kumar", 44));
        edit.addStudent(new Student(5, "Abhijeet jha", 77.6f));

        // printing the highest marks student
        edit.showTopper();

    }
}
