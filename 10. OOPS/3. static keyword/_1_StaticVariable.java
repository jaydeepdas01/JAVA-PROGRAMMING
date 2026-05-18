class Student{
    static int schoolCode = 101;
    
    String name;

    Student(String name){
        this.name = name;
    }

}

public class _1_StaticVariable{
public static void main(String[] args) {
    
    Student s1 = new Student("JOY");
    Student s2 = new Student("deep");

    System.out.println("School Code : " + Student.schoolCode);
    System.out.println("s1 : " + s1.name);
     System.out.println("s2 : " + s2.name);
    //    System.out.println("School Code : " + Student.schoolCode++);
}
}