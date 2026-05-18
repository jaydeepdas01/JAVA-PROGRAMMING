package Test;

import Test2.Cat; // ab bs test 2 ke cat ke hi object bnenge.


public class Test {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.show(); // agar import na kru test 2 ke cat ko , tb ye test1 ke cat ko call krega.
    
        Test2.Cat cat2 = new Test2.Cat();
        cat2.show();
    }
}
