final class Jay{

    private final String name; // final keyword use to fix the vlaue so we can modofied.
    private final int age;

    //constructor, no setter directly initilize with constructor so we can't modify.
    public Jay(String name,int age){
        this.name = name;
         this.age = age;
    }

    //getter for name.
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}


public class _5_ImmutableClass {
    public static void main(String[] args) {
        Jay j1 = new Jay("Jaydeep Das", 22);

        // we can not modified because of there is no any getter and setter.
        //once object is created , the data can not be change.
        System.out.println(j1.getName());
        System.out.println(j1.getAge());
    }
}
