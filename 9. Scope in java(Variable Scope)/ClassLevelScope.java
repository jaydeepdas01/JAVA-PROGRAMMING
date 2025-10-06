public class ClassLevelScope {

    //declared inside class but outside method
    //each object has its own copy
    // accessible by all method inside in the class
    // also accessible using objec 
    int instanceVariable = 10;

    //decleard using static keyboard.
    //only one copy per class
    // accessible by className.VariableName
    static int staticVariable = 20;

    void display(){
    
        System.out.println("Instance Variable Print : "+instanceVariable);
        System.out.println("Static vairiable print  : " + ClassLevelScope.staticVariable);

    }

    public static void main() {
        ClassLevelScope obj = new ClassLevelScope();
        obj.display();

        System.out.println("Calling instance variablw using object " + obj.instanceVariable);
        System.out.println("Calling static varibale with class Name : "+ ClassLevelScope.staticVariable);
    }
}