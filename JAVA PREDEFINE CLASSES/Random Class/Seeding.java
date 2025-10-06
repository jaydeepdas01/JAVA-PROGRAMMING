import java.util.Random;

public class Seeding {
    public static void main(String[] args) {

        // Diffrent seed.
        System.out.println("Different Seed : ");
        Random r1 = new Random(10);
        Random r2 = new Random(100);

        int n1 = r1.nextInt(10) + 1;
        int n2 = r2.nextInt(10) + 1;
        System.out.println(n1);
        System.out.println(n2);

        //same seed print same number even if both object are different.
        System.out.println("Same Seed : ");
        Random r3 = new Random(10);
        Random r4 = new Random(10);

        int n3 = r3.nextInt(10) + 1;
        int n4 = r4.nextInt(10) + 1;
        System.out.println(n3);
        System.out.println(n4);
    }
}
