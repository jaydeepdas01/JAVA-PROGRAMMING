import java.util.Arrays;

public class ReturnArray{
    public static void main(String[] args){
     int[] arr =    getArray1();
     System.out.println(Arrays.toString(arr));

       int[] arr2 =    getArray2();
     System.out.println(Arrays.toString(arr2));
    }

    //direct return array
    static int[] getArray1(){
        return new int[]{1,2,3,4,5};
    }

    //return array in method
    static int[] getArray2(){
        int[] arr = {5,4,3,2,1};

        return arr;
    }

}