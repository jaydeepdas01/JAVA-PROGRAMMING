public class Print_in_Range {
    public static void main(String[] args){
printNum(1,10);
    }

    static void printNum(int start , int end){
        if(start > end)
        return;

        System.out.println(start);
        printNum(start+1, end);
    }

}
