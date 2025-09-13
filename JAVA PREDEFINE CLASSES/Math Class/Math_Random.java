public class Math_Random {
    public static void main(String[] args) {

        // Prints a random decimal number between 0.0 (inclusive) and 1.0 (exclusive)
        // "%.2f" formats the number to show only 2 decimal places
        System.out.printf("Random number between 0.0 to 1.0 : %.2f\n", Math.random());

        // Generate a random integer between 1 and 6
        // Math.random() * 6 → gives value between 0.0 and 6.0
        // (int) → converts to integer (0 to 5)
        // +1 → shifts range to (1 to 6)
        int randomNum = (int)(Math.random() * 6) + 1;

        // Prints the random number (like rolling a dice)
        System.out.println("Dice (Print in range 1 to 6) : " + randomNum);
    }
}
