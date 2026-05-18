package StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        StudentManager manage = new StudentManager();

        // adding student;
        manage.addStudents(new Student(1, "Jaydeep Das", 88.5));
        manage.addStudents(new Student(2, "Amit", 55.5));
        manage.addStudents(new Student(3, "Rohan", 66.7));
        manage.addStudents(new Student(4, "karan", 77.7));

        // show all student
        System.out.println("=== All Students ===");
        manage.showAllStudent();
        // update marks
        System.out.println("\n=== Update Marks ===");
        manage.updateMarks(1, 90.4);

        System.out.println("\n=== After Update ===");
        manage.searchStudent(1); // show only selected student.

    }
}
