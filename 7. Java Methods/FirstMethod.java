public class FirstMethod {
    public static void main(String[] args) {
        FirstMethod.display(); //method class
        display();
    }

    // static method so no need to create objcet of class.
    static void display() {
        System.out.println("Hello, this msg is from method.");
    }
}
