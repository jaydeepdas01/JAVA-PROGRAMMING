public class MethodParameterScope {
    public static void main(String[] args) {
      display(10);
    }

    //method parameter scope:- variable passed to a method are local to that \.
    static void display(int a ){
        //inside the method we can access parameter's variable.
        System.out.println("Passed parameter value : "+ a);
    }
}
