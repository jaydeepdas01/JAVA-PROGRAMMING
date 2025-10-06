public class NestedScope {
    public static void main(String[] args) {
        {
            int a = 10;
            {

                int x = 20;
                //inner scope can access outer variable.
                System.out.println("a : " + a);
                System.out.println("x : " + x);
            }

            // System.out.println("x :" = x); outer scope cannot access inner variable
        }
    }
}
