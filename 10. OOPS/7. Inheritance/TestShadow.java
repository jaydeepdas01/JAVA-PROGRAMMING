class Animal {
    String type;

    Animal(String type){
        this.type = type;
    }

    void showType(){
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    String type; // shadows Animal type

    Dog(String type){
        super("AnimalBase"); // parent ka type set
        this.type = type;   // Dog ka apna type set
    }

    void showDogType(){
        System.out.println("Dog type: " + type);
    }
}

class Puppy extends Dog {
    Puppy(String type){
        super(type);
    }

    void showAllTypes(){
        System.out.println("Animal type via super: " + super.type);
        System.out.println("Dog type via this: " + type);
    }
}

public class TestShadow {
    public static void main(String[] args){
        Puppy p = new Puppy("Golden");
        p.showAllTypes();
    }
}