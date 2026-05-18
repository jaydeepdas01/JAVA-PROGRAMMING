// package Inheritance.Type;

/*wjem one parent class is inheited by multiple child classes
 */

class A{
    void showA(){
        System.out.println("A");
    }
}
class B extends A{ // class B inherit Class A
    void showB(){
        System.out.println("B");
    }
}
class C extends A{// class C inherit Class A
    void showC(){
        System.out.println("C");
    }
}

public class _3_Hierarchical_Inheritance {
    public static void main(String[] args) {
        System.out.println("Class B can use Class A members.");
        B b1 = new B();
        b1.showA();
        b1.showB();

         System.out.println("Class C can use Class A members.");
        C c1 = new C();
        c1.showA();
        c1.showC();

        System.out.println("Because both inherit class A");
    }
}
