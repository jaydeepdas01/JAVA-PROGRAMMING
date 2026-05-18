class Sum{
    Sum(int a, int b){
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }
}

class Input extends Sum{
    Input(int a , int b){
        super(a, b); //  // for parent constructor.passing a, b from Input class.
        System.out.println("I am Input class.");
    }

}

// class Data extends Input{
//     Data(int a , int b){
//         super(a, b); //  // for parent constructor.passing a, b from Input class.
//     }
// }

public class _5_MultiparameterConst {
    public static void main(String[] args){

        Input ip = new Input(10, 20);
        // Data d = new Data(10, 20);
    }
}
