class Human {
    static int population; // it has default value = 0;

    String name;

    Human(String name) {
        this.name = name;
        population += 1;
    }
}

public class _5_Practices {
    public static void main(String[] args) {

        Human joy = new Human("Jaydeep Das");
        Human deep = new Human("Deep Das");
        Human das = new Human("Das");


        System.out.println(joy.name);
        System.out.println(deep.name);

        // belong to the class
        System.out.println("Total population : " + Human.population);
    }
}
