import java.util.Random;

public class RandomClassMethod {
    public static void main(String[] args) {
        Random rand = new Random();

        // nextInt() -> returns a random int value (positive or negative)
        int n1 = rand.nextInt();
        System.out.println("rand.nextInt() : " + n1);

        // nextInt(bound) -> returns a random int between 0 (inclusive) and bound
        // (exclusive)
        int n2 = rand.nextInt(10);
        System.out.println("rand.nextInt(10) : " + n2);

        // nextDouble() -> returns a random double between 0.0 and 1.0
        double d = rand.nextDouble();
        System.out.println("rand.nextDouble() : " + d);

        // nextFloat() -> returns a random float between 0.0 and 1.0
        float f = rand.nextFloat();
        System.out.println("rand.nextFloat() : " + f);

        // nextLong() -> returns a random long value (positive or negative)
        long l = rand.nextLong();
        System.out.println("rand.nextLong() : " + l);

        // nextBoolean() -> returns a random boolean value (true/false)
        boolean bool = rand.nextBoolean();
        System.out.println("rand.nextBoolean() : " + bool);

        // nextGaussian() -> returns a random double value with mean 0.0 and standard
        // deviation 1.0 (bell curve distribution)
        double gaussian = rand.nextGaussian();
        System.out.println("rand.nextGaussian() : " + gaussian);
    }
}
