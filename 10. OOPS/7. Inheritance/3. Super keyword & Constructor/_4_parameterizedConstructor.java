
/* if a parent class has a parameterized constructor only on default constructor
then the child class must explicilty call the parent constructor using super keyword.
otherwise compline time error. */
class Parent1{
     
    Parent1(int a){
        System.out.println("a : " + a);
    }
}

class Child1 extends Parent1{

    Child1(){
        super(10);//  explicity caling parent1 constructor using super keyword.
        System.out.println("I am from child class.");
    }
}

class Child2 extends Child1{

    Child2(){ // default constructor already present in child 1 super() automatically called.
       //but if child1 does not have default const... then we also need to write super(..).
        System.out.println("I am from Child 2 class.");
    }
}
public class _4_parameterizedConstructor {
    public static void main(String[] args) {
        Child2 child = new Child2();    // parent1->Child1 -> child2 constructor execution order.
    }
}
