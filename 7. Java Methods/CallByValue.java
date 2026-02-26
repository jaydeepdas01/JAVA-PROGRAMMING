public class CallByValue {

    int value; // instance variable.

    public static void main(String[] args) {
        int num = 10;
        modify(num); // passing primitive → copy of value goes
        System.out.println("After modify : " + num + ", Still no change."); // original 'num' is unchanged (10)

        int[] arr = { 10, 20, 30 };
        arrayModify(arr); // passing reference type → copy of reference goes
        System.out.println("After modify : " + arr[0] + ", value change"); // array element changes

        // call reassign method
        CallByValue t1 = new CallByValue();
        t1.value = 10;
        reassign(t1);
        // reference is passed by value, so reassignment inside method doesn't affect
        // 't1'
        System.out.println("After reassign : " + t1.value + ", Still no change.");

    }

    // Example with primitive data type
    // In Java, primitives are passed by value (copy of variable is passed)
    static void modify(int x) {
        x = x + 100; // change affects only 'x', not the original 'num'
    }

    // Example with object (reference type)
    // Reference itself is passed by value, but it still points to the same object
    static void arrayModify(int[] num) {
        num[0] = 99; // change reflects in the original array,both point same address.
    }

    
    // This method tries to reassign the object reference
    // But in Java, object references are also passed by value
    // So only the local copy 'obj' points to a new object
    // The original reference in main() remains unchanged
    static void reassign(CallByValue obj) {
        obj = new CallByValue(); // reassigns local copy of reference
        obj.value = 99; // change applies to new object, not the original
    }

}
