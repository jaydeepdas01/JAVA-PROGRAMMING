import java.util.Arrays;
import java.util.List;

public class _9_UpperBoundedWildcard {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sum(l1));

        List<Double> l2 = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println(sum(l2));

        List<Float> l3 = Arrays.asList(1.1f, 2.2f, 3.3f, 4.4f);
        System.out.println(sum(l3));
    }

    static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }
}
