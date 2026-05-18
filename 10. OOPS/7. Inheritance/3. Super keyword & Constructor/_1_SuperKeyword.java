//"super" refer to the immediate parent class object.

class Human {
     int age = 23;

     void show(){
        System.out.println("I am from Human class.");
     }
}
class Person extends Human {
    int age = 20;

    
    void show(){
        super.show(); // parent class show() METHOD.
        System.out.println(super.age); // x = 23 from parent class due to super keyword
        System.out.println("Printing child class variables.");
        System.out.println(age); // current class  = 20.
        System.out.println(this.age); // super refer the parent members. and this refer the current object.
    }
}

public class _1_SuperKeyword {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.show();
    }
}
