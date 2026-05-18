class VoterId {
    private int age;

    // using constructor to write private data.
    public VoterId(int age) {
        if (age >= 18) {
            this.age = age;
        }
    }

    //Check applicable for voting or not.

   public void isApplicable(){
    if (age >= 18) {
            System.out.println("You can vote.");
        }else{
            System.out.println("you Can not vote.");
        }
   }
}

public class _6_WithConstructor {
    public static void main(String[] args) {
        VoterId V1 = new VoterId(20);
        V1.isApplicable();

        VoterId V2 = new VoterId(15);
        V2.isApplicable();

    }
}
