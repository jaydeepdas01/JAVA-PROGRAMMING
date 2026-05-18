class Bank {
    private double balance;

    //setter for balannce.
    public Bank(double balance){
    if(balance >= 0){
        this.balance = balance;
    }else{
        System.out.println("Invalid amount.");
    }
}

   
    public void showBal() {
        System.out.println("Your current Balance : " + balance);
    }

    //method for money withdraw.
      public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    //method for deposite.
  public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
}


public class _7_MyBank {

    public static void main(String[] args) {
        Bank joy = new Bank(5000);
        joy.showBal();

        joy.withdraw(1000);
        joy.showBal();

        joy.deposit(5000);
        joy.showBal();
    }
}