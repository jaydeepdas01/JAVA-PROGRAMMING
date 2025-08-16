public class Logical_Operators {
    public static void main(String[] args) {
        System.out.println("Logical oprator : ");

        System.out.println("Both conditon need to right for true in Logicla AND oprator : ");
        System.out.println("(10 > 2) && (2 > 1)) : " + ((10 > 2) && (2 > 1))); //true
        System.out.println("(10 < 1) && (10 > 2) : " + ((10 < 1) && (10 > 2)));//flase
        System.out.println("(10 < 1) && (10 > 2) : " + ((10 < 2) && (2 < 1))); //false

        System.out.println();
        System.out.println("Only one conditon need to right for true in Logicla OR oprator : ");
        System.out.println("(10 > 2) && (2 > 1)) : " + ((10 > 2) || (2 > 1)));//true
        System.out.println("(10 < 1) && (10 > 2) : " + ((10 < 1) || (10 > 2))); //true
        System.out.println("(10 < 1) && (10 > 2) : " + ((10 < 2) || (2 < 1))); //flase

        System.out.println("LOGICAL NOT reverse the result : ");
        System.out.println(!(10>2)); // false
        System.out.println(!(10<2)); //ture
    }
}
