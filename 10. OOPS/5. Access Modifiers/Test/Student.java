package Test;

public  class Student {
    int rno;
   String name;
    int std;

    void showDate() {
        System.out.println("Student Roll NO. : " + rno);
        System.out.println("Student Name : " + name);
        System.out.println("Student Class : " + std);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
