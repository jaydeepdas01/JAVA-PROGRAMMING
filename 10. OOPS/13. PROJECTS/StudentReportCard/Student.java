package StudentReportCard;

public class Student {
    private int rollNumber;
    private String name;
    private float marks;
    private String result;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // set markss
    public void setMarks(float marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;

            // result depend on marks that's why this put in here.
            if (marks > 30) {
                this.result = "PASS";
            } else {
                this.result = "FAIL";
            }
        }

    }

    // getter for marks;
    public float getMarks() {
        return marks;
    }

    // getter for roll number.
    public int getRollNumber() {
        return rollNumber;
    }

    // getter for result
    public String getResult() {
        return result;
    }
    // pass or fail
    // void isPass() {
    // if (marks > 30) {
    // this.result = "PASS";
    // } else {
    // this.result = "FAIL";
    // }
    // }

    // display students performace
    public void displayDetails() {
        System.out.println(
                "Roll Number: " + rollNumber + ", Name: " + name + ", Marks: " + marks + ", Result: " + result);
    }

}
