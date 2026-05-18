package CalcApp;

import CalcFunction.CalcFunction; // import from CalcFuntion package.

public class App {
    public static void main(String[] args) {

        CalcFunction obj = new CalcFunction();
        int add = obj.add(5, 15);
        int sub = obj.sub(10, 5);
        System.out.println("add : " + add);
        System.out.println("Sub : " + sub);
    }
}
