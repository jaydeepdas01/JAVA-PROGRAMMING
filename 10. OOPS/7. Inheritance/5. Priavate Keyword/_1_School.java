class Human {
    private int age;
    private String name;

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Boy extends Human {
    String country;

    void display() {
        System.out.println("I am from : " + country);
    }

}

public class _1_School {

    public static void main(String[] args) {
        Boy boy1 = new Boy();
        // child class access private data using getter and setter.
        boy1.setAge(10);
        boy1.setName("jaydeep Das");

        boy1.country = "India"; // own variabel.

        // accessing priavate member using getter.
        System.out.println(boy1.getAge());
        System.out.println(boy1.getName());
        //child class own method.
        boy1.display();



    }
}