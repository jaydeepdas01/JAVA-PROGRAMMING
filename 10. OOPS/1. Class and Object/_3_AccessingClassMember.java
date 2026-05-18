class Demo {

    String color;
    int number;
    float marks;

    void show() { // accessing instance variable using method.
        System.out.println("color : " + color);
        System.out.println("Number : " + number);
        System.out.println("Marks : " + marks);
    }

}

public class _3_AccessingClassMember {
    public static void main(String[] args) {
        // 1st object
        Demo demo1 = new Demo();
        demo1.color = "red";
        demo1.number = 1;
        demo1.marks = 100.1f;

        System.out.println("Printing all first object data : ");
        demo1.show();

        //2nd object
        Demo demo2 = new Demo();
        demo2.color = "Green";
        demo2.number = 2;
        demo2.marks = 200.2f;

        System.out.println("Printing all second object data : ");
        demo2.show();

        //3d object
        Demo demo3 = new Demo();
        demo3.color = "blue";
        demo3.number = 3;
        demo3.marks = 300.3f;

        System.out.println("Printing all third object data : ");
        demo3.show();
    }
}
