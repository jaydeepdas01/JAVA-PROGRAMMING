class Student{
    private int age;
    private String name;
    private int rollNo;
    private int std;
//to access private variable we need to create public methods, 


//getter
public void showDate(){
    System.out.println("Student age : " + age);
    System.out.println("Student Name : " + name);
    System.out.println("Student Roll No. : " + rollNo);
    System.out.println("Student Class : " + std);
}

//setter for age.
public void setAge(int age){
    this.age = age;
}

//setter for name
public void setName(String name){
    this.name = name;
}

//setter for roll no.
public void setRoll(int rollNo){
    this.rollNo = rollNo;
}
//setter for Student Class.
public void setStd(int std) {
        this.std = std;
    }


//we can also create single method for all setter;
public void singleSetter(int age, String name, int rollNo, int std){
    this.age = age;
    this.name = name;
    this.rollNo = rollNo;
    this.std = std;
}
}

public class _1_Student {
public static void main(String[] args){
    Student s1 = new Student();
    // s1.age = 10; // we cannot access because of privatel access mofifires

    //we can access with the help of public method of that class.

    s1.setAge(15);
    s1.setName("Jaydeep Das");
    s1.setRoll(12);
    s1.setStd(10);
    s1.showDate(); // print all data.

    //creating another object to show single setter for all variable initilization.
    Student s2 = new Student();
    s2.singleSetter(16, "Dass jii", 31, 10);
    s2.showDate();



}
    
}