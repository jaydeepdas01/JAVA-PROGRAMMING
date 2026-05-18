class Student{
    int id;
    String name;
    float marks;
    String std;

    void displayData(){
        System.out.println("Student ID:- " + id);
        System.out.println("Student Name:- "+ name);
        System.out.println("Student Class :- " + std);
        System.out.println("Student marks :- " + marks); 
        System.out.println();
    }
}

public class _5_Student1{
    public static void main(String[] args){

        Student s1 = new Student(); // object for student 1
        s1.id = 1;
        s1.name = "Jay";
        s1.marks = 80.5f;
        s1.std = "9th";

          Student s2 = new Student();// object for student 2
        s2.id = 2;
        s2.name = "Deep";
        s2.marks = 85.5f;
        s2.std = "9th";

          Student s3 = new Student(); // object for student 2
        s3.id = 3;
        s3.name = "Das";
        s3.marks = 60.5f;
        s3.std = "9th";

        //printing all student details
        s1.displayData();
  
        s2.displayData();

        s3.displayData();
    }
}