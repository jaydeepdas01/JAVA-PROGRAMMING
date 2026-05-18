class Car{
    String model;
    int price;

    //Parameterized constructor.
    Car(String m, int p){
        model = m;
        price = p;
    }

    void show(){
        System.out.println("Car : " + model + " " + "Price : " + price);
    }
}


public class _3_ParameterizedConst {
    public static void main(String[] args) {
        Car car1 = new Car("Honda" , 100); // Argument pass on constructor
        car1.show();

        //we can create multiple object with diffrent values.
        Car car2 = new Car("BMW", 120);
        car2.show();
    }
}
