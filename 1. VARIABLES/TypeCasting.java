/*Typecasting in Java:
- Typecasting means converting a value from one data type to another. */

public class TypeCasting {
    public static void main(String[] args){
/*1. Implicit (Widening) Casting:
   - Automatic conversion from smaller type to larger type.
   - No data loss.
   - Example: int → double */

   int a = 10;
   double b = a;
   System.out.println("Here's int -> double dataType : " + b);

   /*2. Explicit (Narrowing) Casting:
   - Manual conversion from larger type to smaller type using (type).
   - May cause data loss.
   - Example: double → int */

   double c = 10.99;
   int d = (int)c; //Syntax = small dataType varibale name = (small datatype)big dataType.
   System.out.println("Here's double -> int dataType : " + d);


    }
}

/*Why needed:
- To allow operations between different types.
- To control memory and precision.
- For object casting in inheritance. */
