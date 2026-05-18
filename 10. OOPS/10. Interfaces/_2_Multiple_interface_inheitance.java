/*
 * multiple inheritance is not possible in class but we can acheive this via
 * Interfaces.
 *class A{   }
 class B{   }
 class C extends A,B{  } mot possible in class.
 */

interface Human {
    void sleep(); // public abstract void sleep.
}

interface Boy {
    void age();
}

// multiple inheritance via interfaces
class Student implements Human, Boy {
    @Override
    /*
     * interface method should be public because of they are public abstract in the
     * interface and can't be downgrade
     */
    public void sleep() {
        System.out.println("Students sleep daily...");
    }

    @Override
    public void age() {
        System.out.println("Student age between 10-16.");
    }

}

public interface _2_Multiple_interface_inheitance {

    public static void main(String[] args) {
        Human h = new Student();
        h.sleep(); // only access Human's method not Boy's method.

        // can access both because it inherit both Human and Boy.
        Student s1 = new Student();
        s1.sleep();
        s1.age();

        // only access boy's method not Humans.
        Boy b = new Student();
        b.age();

    }
}