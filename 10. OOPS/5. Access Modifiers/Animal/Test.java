class Animal {

    protected String name;
    protected String color;
    protected String sound;

    
}

class SetData extends Animal {

    SetData(String name, String color, String sound) {
        this.name = name;
        this.color = color;
        this.sound = sound;
    }

    void display() {
       System.out.println("Animal Name : " + name + ", color : " + color + ", sound : "+ sound);
    }
}

public class Test {
    public static void main(String[] args) {
        SetData dog = new SetData("Dog", "Red", "Barkk");
        dog.display();

        SetData cat = new SetData("Cat", "Black", "Meaw");
        cat.display();
    }
}
