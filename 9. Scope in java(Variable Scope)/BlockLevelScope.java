public class BlockLevelScope {
    public static void main(String[] args) {

        int x = 10;

        //block level like if else , loops.
        {
            int y = 20;

            System.out.println("x : " + x);
            System.out.println("y : " + y);

            // int x again not possible but variable value change possible beacuse both
            // variable refer same memory address
            x = 30;
        }

        //value change 10 to 30 beacuse both variable refer same address.
        System.out.println("After change value inside black : "+x);

       // System.out.println(y);  cannot access y beacause it's scope only inside the black.
    }
}
