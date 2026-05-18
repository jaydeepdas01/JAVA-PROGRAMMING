class Car {
    String model;
    int price;

    // default constructor.
    Car() {
        model = "Unknown";
        price = 0;
    }

    // parameterized constructor with one parameter
    Car(String m) {
        model = m;
        price = 1;
    }

    // parameterized constructor with two parameter
    Car(String m, int p) {
        model = m;
        price = p;
    }

    void display(){
        System.out.println(model + " " + price);
    }

}

public class _4_ConstOverloading {
public static void main(String[] args) {
    
    Car c1 = new Car();
    Car c2 = new Car("Honda");
    Car c3 = new Car("BMW", 3);
    
    c1.display();
    c2.display();
    c3.display();
}
}
