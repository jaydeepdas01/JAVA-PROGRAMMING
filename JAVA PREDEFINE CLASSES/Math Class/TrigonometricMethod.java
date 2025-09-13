public class TrigonometricMethod {
    public static void main(String[] args){

        // Returns the sine of π/2 (Result = 1.0)
        System.out.println("Math.sin(Math.PI/2) :  " + Math.sin(Math.PI/2));

        // Returns the cosine of 0 (Result = 1.0)
        System.out.println("Math.cos(0)    :  " + Math.cos(0));

        // Returns the tangent of π/4 (Result = 1.0)
        System.out.println("Math.tan((Math.PI/4)): " + Math.tan((Math.PI/4)));

        // Returns the arc sine (inverse sine) of 1.0 (Result = π/2)
        System.out.println("Math.asin(1.0) : " + Math.asin(1.0));

        // Returns the arc cosine (inverse cosine) of 1.0 (Result = 0.0)
        System.out.println("Math.acos(1.0) :  " + Math.acos(1.0));

        // Returns the arc tangent (inverse tangent) of 1.0 (Result = π/4)
        System.out.println("Math.atan(1.0) :  " + Math.atan(1.0));

        // Converts degrees to radians (180° = π radians)
        System.out.println("Math.toRadians(180) " + Math.toRadians(180));

        // Converts radians to degrees (π radians = 180°)
        System.out.println("Math.toDegrees(Math.PI) : " + Math.toDegrees(Math.PI));
    }
}
