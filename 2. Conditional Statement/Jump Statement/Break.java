public class Break {
    public static void main(String[] args) {

        int temp = 0;
        for (int i = 0; i <= 10; i++) {
            temp = i;
            if (i > 5) {
                // If i is greater than 5, immediately exit the loop
                break;
            }
        }

        System.out.printf("Program stop when i = %d", temp);
    }

}
