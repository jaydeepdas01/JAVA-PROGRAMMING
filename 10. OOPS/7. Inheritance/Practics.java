class Vehicle{
    int speed;
    Vehicle(int speed){
        this.speed = speed;
    }

    void showSpeed(){
        System.out.println("Speed : " + speed);
    }
}

class Car extends Vehicle{
    String model ;
    Car(String model,int speed){
        super(speed); // access parent parameterized constructor. also initilize.
        this.model = model;
    }

    void displayModel(){
        System.out.println("Car model : " + model);
    }

}
public class Practics {

    public static void main(String[] args) {
        
        Car car1 = new Car("Honda", 90);
        car1.showSpeed();
        car1.displayModel();


    }
}