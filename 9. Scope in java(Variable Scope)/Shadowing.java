public class Shadowing {

    int a = 10;
    static int x = 100;

    void show(){
        //before shadowing 
        System.out.println("Before shadowing a : " +a);
        System.out.println("Before shadowing x : " + x);

        // local variable hide the class level variable
        int a = 20;
        int x = 30;
        //Shadow the value of a. now if you print a then it give you 20 
        System.out.println("After Shadowing a : " + a);
        System.out.println("After Shadowing x : "+x);
    }

    public static void main(String[] args) {
        Shadowing obj = new Shadowing();
        obj.show();
    }
}
