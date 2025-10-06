public class PrintString {
    public static void main(String[] args){
        String[] str = {"Jay", "deep" , " Das"};

        String result = "";
        System.out.println("Print String values : ");
        for (String s : str){
            System.out.println(s);
            result += s;
        }

        System.out.print("Adding String : ");
        System.out.println(result);
    }
}
