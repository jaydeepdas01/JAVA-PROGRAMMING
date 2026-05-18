class Car{ // Car class
    int speed; //Atrribute / Property, instance variable.
    String color; // Attribute / Property , instance variable.
    int i ;

    void show(){ //Method or begavior.
        System.out.println("Car is driving.");
    }

}

public class _1_Car{ 
 public static void main(String[] args){

    Car car1 = new Car(); // creating object of Car class
    car1.speed = 100;
    car1.color = "Red";

    car1.show();
    System.out.println("Car1 speed : " + car1.speed);
    System.out.println("Car1 Color : " +car1.color);
    

    // second object creating.
    Car car2 = new Car();

    car2.show();
    car2.speed = 120;
    car2.color = "Blue";

    System.out.println("Car2 speed : " + car1.speed);
    System.out.println("Car2 Color : " +car1.color);


 }
    
}

