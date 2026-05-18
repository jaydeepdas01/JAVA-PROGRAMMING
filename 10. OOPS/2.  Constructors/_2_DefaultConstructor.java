class Car{

    String model;
    //default constructor, no Argument.
    Car(){
        model = "Unknown"; // initializing model name;
    }
}

public class _2_DefaultConstructor {
    public static void main(String[] args){
        Car c1 = new Car(); // constructore initialize model = "unknown";
        System.out.println("Car company : " + c1.model); // print unknown;

        c1.model = "Honda";
        System.out.println("Car company : " + c1.model); // re initialize model name.
    }
}
