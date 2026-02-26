public class ConstructorScope {

    //varibale declared inside method local to that constructor.
     ConstructorScope(int x){
        int a = 10;
        System.out.println("a : " + a);
        System.out.println("Constructor parameter value :  " +x);
    }
    public static void main(String[] args) {
        ConstructorScope obj = new ConstructorScope(10);
    }
}
