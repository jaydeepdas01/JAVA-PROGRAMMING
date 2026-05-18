class Parent3 {

Parent3(int a){
System.out.println(a);
}
}
class Child3 extends Parent3{

    
    // java try to call super() but in the parent class  there in no any default construcrtor
    // showing compile time error.
    // to fix that we need to create constructor on child class then add super(..) at the first line
 
   
}
public class _6_CommonMistake {
    public static void main(String[] args) {
        
    }
}
