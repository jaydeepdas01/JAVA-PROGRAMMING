public class RoundingAndApproximation {
    public static void main(String[] args) {

        // Math.ceil(x) => Rounds UP to the nearest integer (even if decimal is small)
        System.out.println("Math.ceil(4.3) : " + Math.ceil(4.3));  // Output: 5.0 (because it rounds UP)

        // Math.floor(x) => Rounds DOWN to the nearest integer (even if decimal is big)
        System.out.println("Math.floor(4.9) : " + Math.floor(4.9)); // Output: 4.0 (because it rounds DOWN)

        // Math.round(x) => Rounds to nearest integer (0.5 and above => UP, below 0.5 => DOWN)
        System.out.println("Math.round(4.5) : " + Math.round(4.5)); // Output: 5 (because 4.5 rounds UP)
        
        System.out.println("Math.round(4.3) : " + Math.round(4.3)); // Output: 4 (because 4.3 rounds DOWN)

    }
}
