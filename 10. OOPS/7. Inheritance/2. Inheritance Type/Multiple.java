class A{
    void showA(){
        System.out.println("A");
    }
}
class B {
    void showB(){
        System.out.println("B");
    }
}

// java does not support multiple inheritance .
// due to ambiguty.
class C extends A,B{ 

}