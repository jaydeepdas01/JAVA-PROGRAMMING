public class Table {
    public static void main(String[] args) {
        table(2,1);
    }

    static  void table(int num,int i){
        if (i >10) {
            return;
        }

        System.out.println(num + " x " + i + ": " +num*i);
        table(num, i+1);
    }
}
