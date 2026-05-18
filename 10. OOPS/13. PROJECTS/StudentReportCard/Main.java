package StudentReportCard;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Jaydeep das");
        s1.setMarks(44.55f);
        Student s2 = new Student(2, "Gaurav Pratap");
        s2.setMarks(22.55f);
        Student s3 = new Student(3, "Shekhar das");
        s3.setMarks(33.55f);

        School school = new School();
        school.addStudents(s1);
        school.addStudents(s2);
        school.addStudents(s3);

        System.out.println("====== Show all Students ========");
        school.showAllStudents();

        System.out.println("====== Find Student by roll number ========");
        school.findStudent(2);

        System.out.println("====== Print only passed Students ========");
        school.showPassedStudents();

    }
}
