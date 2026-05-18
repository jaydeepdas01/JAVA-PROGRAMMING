class Student2 {
    private String name;
    private float marks;

    // getter
    public void getDate() {
        System.out.println("Student name : " + name + " and Marks : " + marks);
    }

    // setter
    public void setname(String name) {
        this.name = name;
    }

    // setter with Validation.
    public void setMarks(float marks) {
        if (marks <= 0 || marks > 100) {
            this.marks = 0;
        } else {
            this.marks = marks;
        }
    }
}

public class _2_StudentMarks {
    public static void main(String[] args) {
        Student2 s1 = new Student2();

        // When marks between 0 and 100;
        System.out.println("When marks between 0 and 100 : ");
        s1.setname("Jaydeep Das");
        s1.setMarks(55);
        s1.getDate();

        // when marks equl to 0 or less then 0;
        System.out.println("When marks less than 0 : ");
        Student2 s2 = new Student2();
        s2.setname("Naruto");
        s2.setMarks(-19);
        s2.getDate();

        System.out.println("When marks Greater than 100 : ");
        Student2 s3 = new Student2();
        s3.setname("Itachi Uchiha");
        s3.setMarks(101);
        s3.getDate();


    }
}
