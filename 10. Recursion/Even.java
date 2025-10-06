public class Even {
   public static void main(String[] args) {
    
    even(1, 10);
   }
   static void even(int a , int z){
    if (a>z) {
        return;
    }

    if (a%2 ==  0) {
        System.out.println(a);
    }
     even(a+1, z);
   } 
}
