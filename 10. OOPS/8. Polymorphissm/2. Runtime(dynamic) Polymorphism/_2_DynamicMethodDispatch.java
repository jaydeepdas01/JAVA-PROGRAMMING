class Vehicle{
    int x;
    void start(){
        System.out.println("Vehicle Start");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car starts with ignition.");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike start with kick.");
    }
}

public class _2_DynamicMethodDispatch {
    public static void main(String[] args) {
        // parent parentRef = new Child();
        Vehicle v; // reference of parent class;
        v = new Car();
        v.start();// execute Car sound() method

        System.out.println(v.x=10);// also access parent variable.
        
        v = new Bike();
        v.start();// execute Bike sound() method..



    }
}
