public class VariableLifeTime {

    int c = 10; //instance variable
    static int a = 10;// static varible

    void show(){
        int b = 10; //local variable
        System.out.println(a + " " + b + " " + c );
        a++;
        b++;
        c++;
    }
    public static void main(String[] args){
        VariableLifeTime obj = new VariableLifeTime();

        obj.show(); // 10  10 10
        obj.show();//  11  10 11
        obj.show();//  12  10 12

        System.out.println();
        VariableLifeTime obj2 =new VariableLifeTime();
        obj2.show(); // 13 10 10
        obj2.show(); // 14 10 11
        obj2.show(); // 15 10 12

    }
}

/*Local variable lifeTime :- 
*Local variable sirf us method / block ke execution ke dauran memory me rehta hai.

* Jaise hi method ka execution complete hota hai, wo variable destroy ho jata hai 
(stack memory se remove ho jata hai).

* Next time jab method dobara call hoga, to naya local variable create hoga 
(purani value ya memory nahi bachegi). */


/*
 static variable lifetime:-
 *Static variable class ke saath belong karta hai, object ke saath nahi.

 *Program start hote hi class load hone ke time memory me create hota hai.
*Program end hone tak memory me rehta hai.

 *Iska matlab: chahe aap kitne bhi objects banao, static variable ek hi copy
  rehta hai sabke liye common
 */

 /* instance variable lifetime:-
  * Instance variable object ke saath belong karta hai.

  * Jab object create hota hai (new keyword se), tab instance
   variable memory me create hota hai.

   *Jab object destroy hota hai (garbage collector ke through),
    tab variable bhi memory se delete ho jata hai.

    * Har object ke paas apna alag copy hota hai instance variable ka.
  */
