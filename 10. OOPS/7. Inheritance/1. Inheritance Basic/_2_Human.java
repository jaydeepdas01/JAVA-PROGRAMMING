class Person{

    String name;
    int age;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);   
    }

}

class Student extends Person{ //student inherit person class
    int rollNo;
    void show(){
        System.out.println("Roll Number : " + rollNo);
    }
}

public class _2_Human {
    public static void main(String[] args){
        Student s1 = new Student();
        //Student class inherit all property of person class so that
        // student can all property of person class.
        s1.name ="Jaydeep Das";
        s1.age = 23;

        s1.rollNo = 20;

        s1.display(); // from parent class
        s1.show();// own method.
    }
}
