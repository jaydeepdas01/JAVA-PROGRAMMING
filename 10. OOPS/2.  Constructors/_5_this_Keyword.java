class Car{
    String model;
    Car(String model){
        // differentiate instanse variable form local variable.
        this.model = model; // "this.model" = instance variable, "model" = parameter.
        // using this we use name name of the variable.
    }

    void display(){
        System.out.println(model);
    }
}

public class _5_this_Keyword {
    public static void main(String[] args) {
        
        Car c1 = new Car("Honda");
        c1.display();

        Car c2 = new Car("Bmw");
        c2.display();
    }
}
