class Cat {
    String name;
    int age;
    char gender;

    // cat constructor
    Cat(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
}

public class _2_AnimalsManager {
    public static void main(String[] args) {

        // creating cat class Array
        Cat[] cat = new Cat[5];

        cat[0] = new Cat(1, "Santra Billa", 'M');
        cat[1] = new Cat(2, "Mini", 'F');
        cat[2] = new Cat(1, "TimTim", 'F');
        cat[3] = new Cat(2, "Heruaa", 'M');
        cat[4] = new Cat(3, "SilToni", 'F');

        // print using loop
        for (int i = 0; i < cat.length; i++) {
            if (cat[i] != null) { // null pointer exception handing.

                System.out.println("Age : " + cat[i].age +
                        ", Name : " + cat[i].name +
                        ", Gender :  " + cat[i].gender);
            }

        }

        System.out.println("Print using for each loop : ");
        for (Cat c : cat) {
            System.out.println("Age : " + c.age + ", Nmae : "
                    + c.name + ", Gender : " + c.gender);
        }

    }
}
