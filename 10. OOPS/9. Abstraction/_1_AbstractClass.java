
// abstract class start with abstract keyword.
abstract class Human {

    int age;

    // abstract method. without body.
    abstract void speak();
}

// either extends with creating another abstract class or impliment the
// abstract method.else error.
class Student extends Human {

    // abstract method implimented here.
    @Override
    void speak() {
        System.out.println("Student can Speak.");
    }
}

public class _1_AbstractClass {

    public static void main(String[] args) {
        Human s1 = new Student();// parent reference = child object.
        s1.speak();// call the Student speak() method at runtime.

        s1.age = 15;// instance variable of parent class
        System.out.println("Age : " + s1.age);

        // Human h1 = new Human() // we can't creat abstract class object.

    }

}