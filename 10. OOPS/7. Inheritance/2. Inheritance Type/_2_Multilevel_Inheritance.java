/*  when a child class inherit from a parent calss , and then 
another child class inherit from that child class */

class A {
    void showA() {
        System.out.println("A");
    }
}

class B extends A { // B inherit A.
    void showB() {
        System.out.println("B");
    }
}

class C extends B { // c inherit B , so c also can use class A member because B inherit A
    void showC() {
        System.out.println("C");
    }
}

public class _2_Multilevel_Inheritance {

    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}