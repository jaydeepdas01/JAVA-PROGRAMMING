class Car{
    String model;
    int price;

    //default constructor
    Car(){
        //calling parameterized constructor. using this().
        this("honda" , 100);
    }

    //parameterized constructor.
    Car(String model, int price){
        this.model = model;
        this.price = price;
    }

    void show(){
        System.out.println("Car : " + model + " " + ", price : " + price); 
    }
}


public class _6_thisConstCall {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.show();

        Car c2 = new Car("Bmw", 200);
        c2.show();
    }
}
