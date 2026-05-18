/* Types of method in interface
1. Abstract method.
2. default Method.
3. static method
4. private method. */

interface Vehicle {
    // abstract method, do body, must be implemented in child class.
    void start(); // internally public abstract void start()

    // Default method, has body , declared using default keyword., use like normal
    // methdd.
    // introduces in java 8;
    // can be overridden.
    default void moving() {
        System.out.println("This vehicle is moving.I am from default method of interface.");
    }

    // static method. belong to interface itself not implementing class.
    // directly access using interface name.
    // must have method vody.
    // can't be override in implementing class.
    static void horn() {
        System.out.println("Vehicle has powerful horn from static method.");
    }

    // private method. only used in inside method.
    // must be have method body.
    // cant't accesss directly,used only within the interface.
    // can't be override
    // can't be inherited.
    // without static keyword only access by default method.
    // if static private method so we also can call using static method.
    private void commonLogic() {
        System.out.println("Common Logic from private method from interface.");
    }

    // call the private method.
    default void callingCommonLogic() {
        commonLogic(); // private method
    }

    // static private method.
    static private void staticPrivate() {
        System.out.println("calling static private method using static method of interface.");
    }

    // static method can call static private method because both are static.
    // but call using interface name.
    static void callStaticPrivatemethod() {
        staticPrivate();
    }
}

class Car implements Vehicle {
    // implement abstract method.
    @Override
    public void start() {
        System.out.println("Car start with key from overriden abstract method");
    }

    // also inherit the Vehicle's default method of Vehical class
}

public class _4_Types_Of_interface_method {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // abstract method of Vehicle interface
        car.moving(); // default method of interface class.

        // calling static method form interface
        Vehicle.horn();

        car.callingCommonLogic(); // calling private method using default methodl.

        // calling static private method using static method.
        Vehicle.callStaticPrivatemethod();
    }
}
