package BankManagementSystem;

public class BankAccount {
    private int accountNumber;
    private String acHolderName;
    private double balance;
    private String acType;

    BankAccount(String acType, int accountNumber, String acHolderName, double balance) {
        this.acType = acType;
        this.accountNumber = accountNumber;
        this.acHolderName = acHolderName;
        this.balance = balance;
    }

    //getter.
    int getAcNunber() {
        return accountNumber;
    }

    String getAcHolder() {
        return acHolderName;
    }

    String getAcType() {
        return acType;
    }

    double getBal() {
        return balance;
    }



    // deposte, work as setter.
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + "Rs. Deposite.");
        } else {
            System.out.println("Invalid amount");
        }
    }

    // withdraw, can access by object of this accss
    //or any array that holding that class object like getter setter.
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + "Rs. Withdray.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // just for showing current balace
    void displayDetails() {
        System.out.println("Account Type : " + acType);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + acHolderName);
        System.out.println("Current balance : " + balance);
    }
}
