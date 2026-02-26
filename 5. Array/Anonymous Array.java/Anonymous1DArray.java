public class Anonymous1DArray{
    public static void main(String[] args) {
        
        int result = sum(new int[]{1,2,3,4,5,6,7,8,9,10});

        System.out.println("Sum of Anomymous 1D array : " + result);
    }
    static int sum(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum ;
    }
}