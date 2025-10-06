public class InstanceMethod {
    public static void main(String[] args) {

        //Creating object of the class , so we can call Instance Method.
        InstanceMethod obj = new InstanceMethod();

        //call Instance Method using object of the class. 
        int result = obj.add(10, 30);
        System.out.println("Sum : " + result);
    }

    // This is a example of Instance Method, we need to create to call this method.
    int add(int a, int b) { // return type method.
        return a + b;
    }
}
